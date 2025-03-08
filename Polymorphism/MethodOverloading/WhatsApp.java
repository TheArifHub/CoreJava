package Polymorphism.MethodOverloading;

public class WhatsApp {

    public void send(String message) {
        System.out.println(message);
    }

    public void send(int no, String message) {
        System.out.println("your number : " + no + ", " + message);
    }

    public static void main(String[] args) {
        WhatsApp app = new WhatsApp();
        app.send("Hello");
        app.send(456, "this is my otp");
    }
}
