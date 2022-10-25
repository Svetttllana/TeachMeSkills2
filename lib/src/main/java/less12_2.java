import java.util.ArrayList;
import java.util.function.Consumer;

public class less12_2 {
static Consumer<String> printUpperCase = str -> { // создали свой собственный консьюмер
    System.out.print(str.toUpperCase()+ " ");
};
    public static void main(String[] args) {

        ArrayList<User> users =  new ArrayList<User>();
        users.add(new User("Katya"));
        users.add(new User("Nastya"));
        users.add(new User("Artiom"));
        users.add(new User("Sasha"));
        users.add(new User("Katya2"));
      //  System.out.println(users);

//        for (User user : users) {
//            System.out.println(user.getName() + " ");
//
//        }

//        users.stream().map(User::getName).forEach(   // метод должен принять в себя акой-то эллемент и что-то там консьюмер. что-то с консьюмером сделать
//                System.out::print
//        );


        System.out.println(users);

        users.stream().map(User::getName).forEach((n)->{
            System.out.println(n+ " ");
        });
     //   System.out.println();


        users.stream().map(User::getName).forEach(printUpperCase);

          //  System.out.println(n+ " ");
        }
    }



class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

