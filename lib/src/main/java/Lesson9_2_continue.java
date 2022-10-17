import java.util.Arrays;
import java.util.Random;

public class Lesson9_2_continue {
    public static void main(String[] args) {
//        int[] massive = new int[10];
//
//        Random random = new Random();
//        for (int element = 0; element < massive.length; element++) {
//
//            massive[element] = random.nextInt(10);
//            System.out.println(Arrays.toString(massive));
//        }
        //многомерные массивы

        int[][] massive2D = new int[][]{{1, 2, 3}, {4, 5, 6}};
        for (int massive1D = 0; massive1D < massive2D.length; massive1D++) { //тут мы пробегаемся по строкам
            for (int element = 0; element < massive2D[massive1D].length; element++) {  //тут по столбцам; во втором цикле мы ищем значение столбцов по измененному инедксу
                System.out.print(massive2D[massive1D][element] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int[] massive1D : massive2D) {
            for (int element : massive1D) {
                System.out.print(element + " ");
            }
            System.out.println("\n");
        }


        int[][] numbers = new int[3][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;

        for (int massive1D=0;massive1D<numbers.length;massive1D++){
            for (int elements=0;elements<numbers[massive1D].length;elements++){
                System.out.print(numbers[massive1D][elements]+"\t");
            }
        }
        String[][]devs = new String[][]{
                {"IOS","Android","Flutter"},
                {"Developer"}
        };
        System.out.println("I am"+devs[0][1]+" "+devs[1][0]);

    }
}
