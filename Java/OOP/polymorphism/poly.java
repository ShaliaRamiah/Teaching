package Java.OOP.polymorphism;
class Cat{
    public void scratch(){
        System.out.println("meow");
    }
}

//(extends) knows everything inside cat class
class Theo extends Cat{
    public void scratch(){
        System.out.println("rawr");
    }
}

public class poly {
    public static void main(String[] args) {

        Theo c = new Theo();
        c.scratch();
        
    }
}
