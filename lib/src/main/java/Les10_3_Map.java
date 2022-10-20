import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Les10_3_Map {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<Person>();
        arrayList.add(new Person("Sasha",18));
        arrayList.add(new Person("Dima",10));
        arrayList.add(new Person("Olya",21));
        arrayList.add(new Person("Sasha",25));
        arrayList.add(new Person("Masha",32));

        System.out.println(arrayList);

        Collections.sort(arrayList, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return Integer.valueOf(person.getAge()).compareTo(
                        Integer.valueOf(t1.getAge())
                );
            }
        });
        for (Person person:arrayList) {
            System.out.println(person.getAge());
        }
    }
}



class Person{
   private int age;
    private String name;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}



//        Iterator iterator = arrayList.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next());
//        }

//   int index = arrayList.indexOf("two");
//        arrayList.remove("two");
//        System.out.println(arrayList);













//// тут про мэп
//       TreeMap hashMap = new TreeMap();
//        hashMap.put("A","C");
//       hashMap.put("D","A");
//        hashMap.put("B","D");
//        hashMap.put("C","B");
//
//      //  hashMap.remove("Animal");
//        System.out.println(hashMap);
