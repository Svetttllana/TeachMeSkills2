import java.util.Arrays;

public class Lesson9 {
    public static void main(String[] args) {
//        String[] massive = {"Hello","bye","world"};
//        int[] massive2 = new int[5];
//        massive2[0]=1;
//        massive2[1]=2;
//        massive2[2]=3;
//        massive2[3]=4;
//        massive2[4]=5;

//        System.out.println(massive[0]);
//
//        for (int i = 0; i< massive.length;i++){
//            System.out.println(massive[i]+"\n");
//        }
//
//        for (int i = 0; i< massive2.length;i++){
//            System.out.println(massive2[i]+"\n");
//        }



        // new massive

//        String[] massive =new String[] {"Hello","bye","world","  "};
//        massive=new String[]{"Hello","bye","world","country"};
//        System.out.println(massive[2]);
        // new massive

//        int[] massive=new int []{16,-17,22,0,1,33,5,4,7};
//        for (int i = 0; i<=massive.length-1;i++){
//            System.out.println(massive[i]+ " ");
//
//        }
//        Arrays.sort(massive);
//        System.out.println("\n");
//        for (int i = 0; i<=massive.length-1;i++) {
//            System.out.println(massive[i] + " ");
//        }
//        System.out.println("\n");
//       int index = Arrays.binarySearch(massive,5);
//         System.out.println(index);

        //new primer

//        int[] massive=new int []{16,-17,22,0,1,33,5,4,7};
//       for (int i =0; i<massive.length;i++){
//           System.out.println(massive[i]+ " ");
//
//
//       }
//       for (int element : massive){
//           System.out.println(element + " ");
      //}
       int[] temp = new int[]{16,-17,22,0,21,33,5,4,-7};
       double averageTemp;
       int  sumOfTemp = 0;
       for (int i =0; i<temp.length;i++){
           sumOfTemp += temp[i];
       }
averageTemp =(double) sumOfTemp/temp.length;
       System.out.println(averageTemp);
    }
    }

