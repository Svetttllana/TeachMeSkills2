public class ReaseCondition_2 {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        for (int i = 1; i < 6; i++) {                         //   в этом создаем 5 потоков
            Thread thread = new Thread(new CountTread(commonResource));
            thread.setName("Thread: " + i);                                    //присваиваем имя потоку
            thread.start();
        }


    }
}

//сначала создадим общий ресурс
class CommonResource {
    int count = 0;

}

class CountTread implements Runnable {

    CommonResource commonResource;

    CountTread(CommonResource commonResource) {  //здесь создаем рбычный конструкт
        this.commonResource = commonResource;
    }


    @Override
    public void run() {
        synchronized (commonResource) {                                       // вот тут забубенили синхронайзд и теперь все красиво выводит. и обозначили шо это наш ранбл ресурс
            commonResource.count = 1;
            for (int i = 1; i < 5; i++) {                                //  в этом цикле мегяем счетчик
                System.out.printf("%s %d \n",
                        Thread.currentThread().getName(),
                        commonResource.count                //   выводим значение счетчика
                );
                commonResource.count++;                        //прост увеличили счетчик
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }

        }
    }
}
// по итогу получилась гонка. делаем синхронайзд