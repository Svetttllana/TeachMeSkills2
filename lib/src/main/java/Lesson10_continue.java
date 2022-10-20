import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lesson10_continue {
    public static void main(String[] args) {
Object [] numbers = {3,1,4,6,2,5,7,9,8};

        List arrayList = new ArrayList(Arrays.asList(numbers)); //преобразуем массив в лист
        arrayList.add(0);
        Collections.sort(arrayList);
                arrayList.toArray();
        System.out.println(arrayList);                                                       //  преобразуем коллекцию в массив
        Collections.reverse(arrayList);                                         //мутод обратной сортировки; или реверсодер
        System.out.println(arrayList);

        for (int value = 0; value < arrayList.size(); value++) { // берем элементы по индексу
            System.out.print(arrayList.get(value)+ " ");
        }
    }
}






















//        int[][] numbers  = {{3,1,4},{6,2,5},{7,9,8}};
//        for (int[] number1D:numbers){
//            Arrays.sort(number1D);
//            for (int number: number1D) {
//                System.out.print(number+ " ");
//                //1 3 4 2 5 6 7 8 9
//            }
//        }
//        System.out.println();
//
//        for (int[] number1D:numbers){
//            for (int number = 0; number < number1D.length; number++) {
//                System.out.print(number1D[number1D.length-1]-number);
//            //432654987
//            }
//        }