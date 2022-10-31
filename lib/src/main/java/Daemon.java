public class Daemon {
    public static void main(String[] args) {
        TreadClass2 treadClass2 = new TreadClass2();
        treadClass2.setDaemon(true);
        treadClass2.start();

    }
}

class TreadClass2 extends Thread {
    @Override
    public void run() {
        System.out.println("I'm daemon thread " + Thread.currentThread().isDaemon());
    }
}
