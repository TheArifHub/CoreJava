package Abstraction;

abstract class Mobile {

    abstract void call(int number);

    abstract void message(int number,String meassage);
}

class Realme extends Mobile {
    void call(int number)
    {
        System.out.println("Calling to "+number);
    }
    void message(int number,String message)
    {
        System.out.println("The Message "+message+" is send to this number"+number);
    }
}

public class MobileOperator {
    public static void main(String[] args) {
        Mobile mobile = new Realme();
        mobile.call(1234);
        mobile.message(1234, "Hello");
    }
}
