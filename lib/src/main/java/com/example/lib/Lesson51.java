package com.example.lib;

public class Lesson51 {
    public static void main(String[] args) {
     //   friend friend = new friend("shasha");
        //friend.age =18;
        //friend.name ="Shasha";
       // friend2.born();
      //  friend.born();
    }
}

class friend {

    String name;
    int age;
    String birthdate;

    //public friend(String name2, int age2, String birthdate2) {
      //  this.name = name2;
        //this.age = age2;
        //this.birthdate = birthdate2;

   // }

    public friend(String name2, int age2, String birthdate2){
    this.name =name2;
    this.age =age2;
    this.birthdate = birthdate2;
}
    void born(){
        String congratulations= " ";
        if (birthdate == null||birthdate.isEmpty()) {
            congratulations = "no birthday";
        }else{

            congratulations = name + name + "hes berthday on:" + birthdate + " " + "he is" + age + " years old";
        }
        System.out.println(congratulations);
    }
}

