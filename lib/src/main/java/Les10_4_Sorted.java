import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Les10_4_Sorted {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Sasha");
        arrayList.add("Dima");
        arrayList.add("Olya");
        arrayList.add("Sasha");
        arrayList.add("Masha");

        Collections.sort(arrayList, Comparator.<String>naturalOrder());
        System.out.println(arrayList);

        System.out.println();

        Collections.sort(arrayList, Comparator.<String>reverseOrder());
        System.out.println(arrayList);

    }
}
