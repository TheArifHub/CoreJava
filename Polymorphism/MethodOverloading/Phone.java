package Polymorphism.MethodOverloading;

class Contacts {

    public static void search(long phoneNumber) {
        System.out.println("Searching by phone number saved: " + phoneNumber);
    }

    public static void search(String contactName) {
        System.out.println("Searching by name saved: " + contactName);
    }
}

public class Phone {
    public static void main(String[] args) {
        Contacts.search("Arif");
        Contacts.search(7788994455l);
    }
}
