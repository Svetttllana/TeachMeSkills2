package Lesson10_Collections;

import java.util.HashSet;
import java.util.Objects;

public class Lesson10_2 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Student("Olya"));
        hashSet.add(new Student("Olya"));
        hashSet.add(new Student("Masha"));
        hashSet.add(new Student("Sasha"));
hashSet.add(" ");

        System.out.println(hashSet.size());
    }
}
class Student{
    private String name;

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
