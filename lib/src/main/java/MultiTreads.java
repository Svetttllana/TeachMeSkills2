public class MultiTreads {

    //reproduse Rase condition
    public static void main(String[] args) {


        TreadClass treadClass = new TreadClass();

        Thread thread1 = new Thread(treadClass);
thread1.start();
        Thread thread2 = new Thread(treadClass);
thread2.start();
    }
}
class TreadClass implements Runnable{
    int count = 0;
    @Override
    public void run() {
        for (int i = 0; i<10;i++){
            count++;
            System.out.print(count + " ");
        }
    }
}