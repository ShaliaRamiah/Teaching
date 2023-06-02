package Java.OOP.encapsulation;

public class encapsulation {
    public static void main(String[] args) {
        
        studentEnc s = new studentEnc();

        s.setName("Shalia");
        s.setAge(21);

        System.out.println(s.getName());
        System.out.println(s.getAge());

    }
}
