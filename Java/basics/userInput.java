package Java.basics;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("type something in console: ");
        String something = scan.nextLine();
        System.out.println(something);

        scan.close();
    }

   
}
