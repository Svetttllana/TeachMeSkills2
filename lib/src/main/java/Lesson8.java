public class Lesson8 {
    public static void main(String[] args) {
        try {
            getWrongValue(null);
        }catch (ArithmeticException  | NullPointerException |IndexOutOfBoundsException e) {
            System.out.println("oshibka");
        }finally{
            System.out.println(" do if success or exeption throw");
//        } catch (NullPointerException e) {
//            System.out.println("caught NullPointExeption");

//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("caught exeption");

//        } catch (RuntimeException e) {
//            System.out.println("caught RunTimeExeption");
        }
    }
        static void getWrongValue (Integer value){
            System.out.println(value.toString());
        }
    }

