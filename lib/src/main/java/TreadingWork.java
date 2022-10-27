public class TreadingWork {
    public static void main(String[] args) {
//  1 способ
//        ThreadClass1 threadClass1 =  new ThreadClass1();
//    threadClass1.start();
//
//    ThreadClass2 threadClass2 = new ThreadClass2();
//        Thread thread1 = new Thread(threadClass2);   // передаем ранбл и вызываем у другого метода метод старт кря. когда юзаем ранбл то так делаем как тут .
//        thread1.start();



    }
}

class ThreadClass1 extends Thread{
    @Override
    public void run() {
        System.out.println("I'm running in Thread");
    }
}


class ThreadClass2 implements Runnable{

    @Override
    public void run() {
        System.out.println("i am running in Runable");
    }


}