public class ThreadWork3 {
    public static void main(String[] args) {

        ThreedClass5 threadClass5 = new ThreedClass5();
     //   threadClass5.start();

        Thread thread1 =  new Thread(threadClass5);// короч если мы так одновременно запускаем 2 потока
        // то через цикл выводит разные значения и поток путается и получается ерунда.
        // поэтому создаем джоин
        thread1.start();
        try {
            thread1.join();
        } catch (Exception e) {}

        Thread thread2 =  new Thread(threadClass5);
        thread2.start();
    }
}

class ThreedClass5 extends  Thread{
    private int count;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            count++;
            System.out.print(count + " ");
        }
    }
}