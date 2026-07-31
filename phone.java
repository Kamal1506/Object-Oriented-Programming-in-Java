abstract class Phone{
    private String password = "1234";
    public void makeCall(int number){
        System.out.println("Calling : "+number);
    }
    abstract void unlock();
}

class Android extends Phone{
    @Override
    public void unlock(){
        System.out.println("face");
    }
}

class Iphone extends Phone{
    @Override
    public void unlock(){
        System.out.println("FingerPrint");
    }
}
public class oop{
    public static void main(String []args){
        Phone ph = new Android();
        ph.unlock();
    }
}
