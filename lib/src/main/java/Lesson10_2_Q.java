import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Lesson10_2_Q {
    public static void main(String[] args) {
ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        arrayDeque.push("flutter developer");
        arrayDeque.addFirst("android developer");
        arrayDeque.addLast("python developer");
        arrayDeque.add("ios developer");

    System.out.println(arrayDeque);
//        System.out.println(arrayDeque.peekLast());


        ArrayList arrayList = new ArrayList();
        arrayList.addAll(arrayDeque);
        System.out.println(arrayList.get(2));


        //Set <String> set = new TreeSet<String>();
        Set <String> set = new HashSet<String>();
        set.add("one ");
        set.add("four");
        set.add("three");
       // set.addAll(arrayList);
        System.out.println(set);
    }
}






































//        Queue queue = new PriorityQueue();
//        queue.offer("Hello");
//        queue.offer("Bye");
//        queue.offer("World");
//
//
//
//        System.out.println(queue);
//        // System.out.println(queue.peek());
//        //  System.out.println(queue.element());
//       queue.remove();
//        System.out.println(queue);