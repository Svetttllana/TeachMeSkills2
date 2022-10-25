import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        Optional<Integer> optInt = Optional.empty();
        if(optInt.isPresent()){
            System.out.println(optInt.get());
        }else {
            System.out.println("no value");
        }
    }
}
