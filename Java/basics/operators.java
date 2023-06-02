package Java.basics;
public class operators {

    public static void main(String[] args) {

        // operators:

        // > greater than 
        // < less than 
        // >= greater than or equals to 
        // <= less than or equals to 
        // == equal to 
        // != not equal to 
        // ++ increment 
        // -- decrement
        

        int a = 4;
        int b = 9;

       boolean c = (a == b);

       System.out.println(c);

        //if a is equal to 4, add 5
       if (a == 4) {
        System.out.println(a + 5);
       }

       //if b is greater than or equal to 8, increment a by 1
       if (b >= 8) {
        a++;
        System.out.println(a);
       }
        
       //if a is equal to 6 or 5 display message
       if ( a == 6 || a == 5){
        System.out.println("a is either 6 or 5");
       }


    }

}