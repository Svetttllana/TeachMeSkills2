import java.util.Arrays;
// удобное вычесление
public class Zadacha {
    public static void main(String[] args) {
        int[] mass = new int[]{25,47,34,18,96,33,28,55,87,13};
        int minValue;
        int maxValue;
        Arrays.sort(mass);
        minValue = mass[0];
        maxValue = mass[mass.length-1];
        System.out.print("minValue"+" " + minValue +"\n"+ "maxValue" + " " + maxValue);

    }
}
