public class Funk_Interfase {
    public static void main(String[] args) {

        Operationable2<Integer> operationable2; //ставить интеджер для калкулате2
        // тут мы указали что ожидаем 2 значения и потом складываем это
        //Operationable operationable;
//        operationable = (a,b) -> a+b;
        operationable2 = (a, b) -> a > b;

        boolean result = operationable2.calculate2(10, 20);
        System.out.println(result);

        // так бы было до лямбды или без неё/  это типа через анонимный класс
//        Operationable operationable = new Operationable() {
//            @Override
//            public int calculate(int a, int b) {
//                return a+b;
//            }
//        };
//
//       int result = operationable.calculate(10,10);
//        System.out.println(result);
//    }
    }

    // когда мы используем  интерфейс для лямбды мы используем фанкшионал интерфейс. он конкретно говорит о ламбде
    @FunctionalInterface
    interface Operationable {
        int calculate(int a, int b); // эт интерф с использ лямбда-выражений


    }

// Predicate
    interface Operationable2<T> {
        boolean calculate2(T t, T t1); // выучить интерфейсы. это предикат.
    }
}