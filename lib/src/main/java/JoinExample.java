public class JoinExample {
    public static void main(String[] args) {
        System.out.println("Main threed is running");

    Thread thread = new Thread(){
        @Override
        public void run() {
            System.out.println( " Second threed is running");
        }
    };

    thread.start(); //  можно закоментить трай лэтч с джоином и посмотреть шо будет
//        try {
//            thread.join();
//        } catch (Exception e) {
//            System.out.println("caught exeption");
//        }
       System.out.println("Main threed is finished");
    }
}

