class WhatsApp
{
    public static void send(int no)
    {
        System.out.println(no);
    }
    public static void send (String text)
    {
        System.out.println(text);
    }
    public static void send (int no,String text)
    {
        System.out.println(no+text);
    }
    public static void send(String text, int no)
    {
        System.out.println(text+no);
    }
}
public class MyUser {
    public static void main(String[] args) {
        WhatsApp.send(1234);
        WhatsApp.send("Hello");
        WhatsApp.send("Good Moring",07);
        WhatsApp.send(10,"Bye");
    }
}
