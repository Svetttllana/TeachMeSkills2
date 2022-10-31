public class SinchronizedMethood_1 {
    // 2способ синхронизации
    // лучше всю синхронизации выполнять над ресурсом
    public static void main(String[] args) {
        CountThread1 countThread1 = new CountThread1();
        Thread thread1 = new Thread(countThread1);
    thread1.start();
        Thread thread2 = new Thread(countThread1);
        thread2.start();


    }
}

class CountThread1 implements Runnable{
    private  int count = 0;

    synchronized void changeValue(){
        for (int i = 0; i < 10; i++) {                    // попробовали сюда впихнуть фор
            count ++;
            System.out.print(count+ " ");
        }
        //создаем синхронизированный метод


    }

    @Override
    public void run() {
        //  for (int i = 0; i < 10; i++) {
            // отсюда удалили вывод значений и вызвали в синхр методе// наш счетки обнов 9 раз
            changeValue();
        }
    }
//}