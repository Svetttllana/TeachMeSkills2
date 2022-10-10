public class Lesson8_3 {
    public static void main(String[] args) {
        Shop shop =  new Shop();
        try{
            shop.setAge(12);
        }catch (CantSellToChildeExepyion e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println(shop.getAge());
        }
    }
}

class Shop{
    private int age;
    public   int getAge(){
        return age;
    }
    public void setAge(int age) throws CantSellToChildeExepyion{
        if (age<18){
            throw  new CantSellToChildeExepyion("you are a child, can't sent vodka to you");
        }else {
            this.age=age;
            System.out.println("alcohol sold");
        }
    }
}


class CantSellToChildeExepyion extends Exception{
    private String message;
 CantSellToChildeExepyion(String message){
     this.message=message;
     setMessage(message);
 }
    public String getMessage() {
        return message;
    }
    public void setMessage(String messge) {
        this.message = messge;
    }
}