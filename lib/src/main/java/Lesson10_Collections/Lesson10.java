package Lesson10_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;


public class Lesson10 {
    public static void main(String[] args) {
//        ArrayList <String> arrayList = new ArrayList();
//        arrayList.add("hello");

//        List<String> linkedList1 =new LinkedList1();
//        LinkedList.add("hello");

//        arrayList.add("bye");
//        arrayList.add("world");

       // arrayList.clear();
        //System.out.println(arrayList.size());

//
//        System.out.println(arrayList.indexOf("bye"));
//        arrayList.add(1,"hi");
//        System.out.println(arrayList.indexOf("bye"));

        // пишем сортет SortedSet

        SortedSet sortedSet = new TreeSet<String>();
        sortedSet.add("banana");
        sortedSet.add("apple");
        sortedSet.add("orange");
        sortedSet.add("banana");

        System.out.println(sortedSet);

    }
}
