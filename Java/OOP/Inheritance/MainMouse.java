package Java.OOP.Inheritance;

public class MainMouse {
    public static void main(String[] args) {
        
        blackMouse b = new blackMouse();
        pinkMouse p = new pinkMouse();
        redMouse r = new redMouse();

        Mouse.leftClick();
        Mouse.scrollDown();

        System.out.println(b.skin);

        p.colour();
        r.connect();


    }
}
