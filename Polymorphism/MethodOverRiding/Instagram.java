package Polymorphism.MethodOverRiding;

class PostImage {
    public void post() {
        System.out.println("Image Posted Success!");
    }
}

class PostReel extends PostImage {

    public void post() {
        super.post();
        System.out.println("Reel Posted Success!");
    }
}

class PostIgtv extends PostReel {
    public void post() {
        super.post();
        System.out.println("IGTV Posted Success!");
    }
}

class Story extends PostIgtv {
    public void post() {
        super.post();
        System.out.println("Story Posted success!");
    }
}

public class Instagram {
    public static void main(String[] args) {
        Story obj = new Story();
        obj.post();

    }
}
