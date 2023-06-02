package Java.basics;

public class recusion {
    public static void main(String[] args) {
        // sayHello(2);

        count(10);

    }


    public static void count(int i) {
        if(i == 0){
            System.out.println("done");
        } else {
            System.out.println(i);
            i--;
            count(i);
        }
        
    }
    // public static void sayHello(int i) {
    //     if(i == 0){
    //         System.out.println("done");
    //     }else {
    //         System.out.println("hi");
    //         i--;
    //         sayHello(i);
    //     }
    // }

    //need base case
    
}
