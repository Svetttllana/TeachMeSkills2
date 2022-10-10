package com.example.lib;

public class Lesson51 {
    public static void main(String[] args) {
        friend friend = new friend("Shasha", 18, "20.02.2001");
 //    friend friend2 = new friend("Dima",28);
        friend.age =18;
     friend.name ="Shasha";
   //   friend2.born();
       friend.born();
    }
}

class friend {

    public int age;
    public String name;
       public String birthdate;

   //public friend(String name2, int age2, String birthdate2) {
     // this.name = name2;
    //this.age = age2;
    //this.birthdate = birthdate2;

   //}

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

            congratulations = name + "hes berthday on:" + birthdate + " " + "he is" + age + " years old";
        }
        System.out.println(congratulations);
    }
}

