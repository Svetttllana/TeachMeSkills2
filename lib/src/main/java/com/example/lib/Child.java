package com.example.lib;

public class Child extends Parent{

    protected int age = 20;

    @Override
    void speak() {
       System.out.println(" I speak loudly");
       super.speak();
    }

    public static void main(String[] args) {
        Parent child = new Child();
        Parent parent = new Parent();
child.eye_color ="green";
        System.out.println("eye color of the child:" + child.eye_color);
        System.out.println("eye color of the parent:" + parent.eye_color);
        child.speak();
       // parent.speak();
    }

    void  phoneNumber(int number){

    }
    void  phoneNumber(int number, String mobile_operator){

    }







}


class  Parent{

   protected String eye_color = "blue";
   void speak(){
       System.out.println(" I speak quitely");
   }
}

class uncle {
    public static void main(String[] args) {
        Parent perent = new Parent();
        Child child = new Child();
                System.out.println(perent.eye_color);
        System.out.println(child.age);
    }
}