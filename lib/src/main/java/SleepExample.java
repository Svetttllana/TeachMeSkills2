public class SleepExample {
    public static void main(String[] args) {
    ThreadClass6 threadClass6 = new ThreadClass6();
    threadClass6.start();
        long start = System.currentTimeMillis();
        System.out.println("called in thread: "
                + Thread.currentThread().getName()+ " " + start);
    }
}

class ThreadClass6 extends Thread{
    private  int count;

    @Override
    public void run() {
        try {
            sleep(2000);
        } catch (Exception e) {}
        long start = System.currentTimeMillis();  // берет текущие милисекунды
        Thread thread = Thread.currentThread();// берет текущий поток
        System.out.println("I am run this code in: " + thread.getName()+ " " + start);
    }
}