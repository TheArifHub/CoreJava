package Abstraction;
abstract class Chrome{
    abstract void search(String songName);
    abstract void voiceSearch();
}
abstract class Browser extends Chrome{
    void search(String songName)
    {
        System.out.println("Song name found "+songName);
    }
}
class Google extends Browser{
    void voiceSearch(){
        System.out.println("Searched by voice note");
    }
    public static void main(String[] args) {
        Google google = new Google();
        google.search("Hip hop");
        google.voiceSearch();
    }
}

