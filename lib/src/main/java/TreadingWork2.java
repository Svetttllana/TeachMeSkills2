public class TreadingWork2 {
    public static void main(String[] args) {
        // vtoroi sposob na osnove anonimnogo classa(переопределение логики которая будет выполнятся на другом потоке)

//        ThreadClass3 threadClass3 =  new ThreadClass3(){       // создали анон класс тут
//
//            @Override
//            public void run() {                                  //анон класс нужен чтобы что-то поменять локально. т.к если бы поменяли в основном то поменялось бы везде
//                super.run();
//              System.out.println("Run is Thread in anon class");              // переопределили метод ран
//            }
//        };
//
//threadClass3.start();


        // 3й способ через создание локального анон класса, шоб не создавать лишний классю если над только поток. с лямбдами улчше жеска не заигрывать

         Thread thread = new Thread(){
             @Override
             public void run() {
                 super.run();
                 System.out.println("I am running in thread");

             }
         };
         thread.start();
       //  создадим локальн ранбл интерфейс
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(" I am running in runable");

                    }
                };
                Thread thread1 = new Thread(runnable);
                thread1.start();
    }
}



class ThreadClass3 extends Thread{
    @Override
    public void run() {
        System.out.println("I'm running in Thread");
    }
}


class ThreadClass4 implements Runnable{

    @Override
    public void run() {
        System.out.println("i am running in Runable");
    }


}