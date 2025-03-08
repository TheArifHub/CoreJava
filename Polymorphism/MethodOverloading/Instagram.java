package Polymorphism.MethodOverloading;

public class Instagram {

    public void yourActivity(int likes) {
        System.out.println("Likes given : " + likes);
    }

    public void yourActivity(String comments) {
        System.out.println("Comments : " + comments);
    }

    public void yourActivity(int likes, String comments, int tag) {
        System.out.println("liked by : " + likes + " members " + "comments recived " + comments + " tagged to " + tag
                + " follwers");
    }

    public static void main(String[] args) {
        Instagram obj = new Instagram();
        obj.yourActivity(100);
        obj.yourActivity("good post");
        obj.yourActivity(50, "nice pic", 2);
    }

}
