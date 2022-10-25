public class Function_less12 {
    public static void main(String[] args) {


        Operationable4<Integer> operationable4;
        operationable4 = (a, b) -> System.out.println(a +" "+ b);
operationable4.calculate(21,22);




//     Operationable2<Integer,String> operationable2;
//        operationable2 = (a, b) ->{                                // это все для функшиона
//         return    a + b +" I will be back";

        };

// String result = operationable2.calculate(10, 20);
//        System.out.println(result);

    }
//}








// интерфейс типа fubction ; лямбда типа function
@FunctionalInterface
interface Operationable2<T,R> {
    R calculate (T t, R t1);


    }

//это Consumer
    interface Operationable4<T>{
    void  calculate(T t, T t1);
    }



