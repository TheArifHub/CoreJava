package Polymorphism.MethodOverRiding;

class WhatsApp {

    public void send() {
        System.out.println("Messages");
    }
}

class WhatsAppV1 extends WhatsApp {

    public void send() {
        super.send();
        System.out.println("Images");
    }
}

class WhatsAppV2 extends WhatsAppV1 {

    public void send() {
        super.send();
        System.out.println("Videos");
    }
}

public class ChattingApplication {
    public static void main(String[] args) {
        WhatsAppV2 v2 = new WhatsAppV2();
        v2.send();
    }
}
