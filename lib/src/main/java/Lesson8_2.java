import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class Lesson8_2 {
    public static void main(String[] args) {
//        try {
//            throwUPCheckedExeption();
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }

      //  try {
     //       throwCheckExeption();
//        } catch (Exception e) {
//            System.out.println("handle checked exeption");
//        }

    }
    static  void throwUPCheckedExeption() throws  NullPointerException{
        throw new NullPointerException("runTime");
    }
    static void throwCheckExeption() throws FileNotFoundException {
        throw new FileNotFoundException("compileTime");
    }
}
