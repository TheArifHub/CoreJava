package Inheritance;

interface Phone {
    void makeCall(String number);
}

interface Computer {
    void browseInternet(String website);
}

class SmartPhone implements Phone, Computer {

    @Override
    public void browseInternet(String website) {
        System.out.println("Browsing the wesite " + website);
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling this number " + number);
    }

}

public class MultipleInheritance {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall("9987456321");
        smartPhone.browseInternet("https://github.com/TheArifHub/CoreJava");
    }
}
