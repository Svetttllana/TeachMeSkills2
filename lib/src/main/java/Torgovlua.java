public class Torgovlua {
    //wait/notoFy example

    public static void main(String[] args) {
        Store store = new Store();
        Produser produser = new Produser(store);
        Consumer consumer = new Consumer(store);
        new Thread(produser).start();
        new Thread(consumer).start();


    }
}


class Produser implements Runnable {
    Store store;

    Produser(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}


class Consumer implements Runnable {
    Store store;

    Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store.get();
        }
    }
}

class Store {
    private int product = 0;

    synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.print("get interapted");
            }
        }
        product--;
        System.out.println("consumer bought 1 product");
        System.out.println("Product available: " + product);
        notify();

    }

    synchronized void put() {
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("get interapted");
            }
        }
        product++;
        System.out.println("Produser made 1 product");
        System.out.println("Products available: " + product);
        notify();
    }
}
