package Polymorphism.MethodOverloading;

class MarksCard {

    public void percentage(double sem1, double sem2) {
        System.out.println("One year Percentage : " + (sem1 + sem2) / 2);
    }

    public void percentage(double sem1, double sem2, double sem3, double sem4) {
        System.out.println("Two years of Percentage : " + (sem1 + sem2 + sem3 + sem4) / 4);
    }

    public void percentage(double sem1, double sem2, double sem3, double sem4, double sem5, double sem6) {
        System.out.println("Three years of Percentage : " + (sem1 + sem2 + sem3 + sem4 + sem5 + sem6) / 6);
    }

}

public class Student {
    public static void main(String[] args) {
        MarksCard card = new MarksCard();
        card.percentage(60.5, 70);
        card.percentage(80, 80, 80, 80);
        card.percentage(75, 65, 55, 45, 50, 72);
    }
}
