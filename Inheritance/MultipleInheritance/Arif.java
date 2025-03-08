package Inheritance.MultipleInheritance;

interface Phone {
    void call();
}

interface Computer {
    void browseInternet();
}

class SmartPhone implements Phone, Computer {

    public void call() {
        System.out.println("Calling...!");
    }

    public void browseInternet() {
        System.out.println("Searching...!");
    }

}

public class Arif {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.call();
        phone.browseInternet();
    }
}
