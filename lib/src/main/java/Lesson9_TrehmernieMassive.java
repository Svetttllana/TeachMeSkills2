import java.util.Arrays;

public class Lesson9_TrehmernieMassive {
    public static void main(String[] args) {
        int[][][] numbers = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9}
                }
        };
//        for (int[][] numbers2D:numbers){
//            for (int[]numbers1D:numbers2D){
//                for (int number : numbers1D){
//                    System.out.println();
//                }
//            }
//            System.out.println(Arrays.deepToString(numbers));
        //    }

        for (int numbers2D = 0; numbers2D < numbers.length; numbers2D++) {
            for (int numbers1D = 0; numbers1D < numbers[numbers2D].length; numbers1D++) {
                for (int numbers1 = 0; numbers1 < numbers[numbers2D][numbers1D].length; numbers1++) {
                    System.out.print(numbers[numbers2D][numbers1D][numbers1] + "\t");
                }
                System.out.println();
            }

        }
    }
}
