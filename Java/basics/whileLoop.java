package Java.basics;
import java.util.ArrayList;
import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {


        //getting words in a sentence and store them in an array
        String sentence = "I like sushi";
        Scanner scan = new Scanner(sentence);
        ArrayList<String> words = new ArrayList<String>();

        while (scan.hasNext()){
            words.add(scan.next());
        }

        System.out.println(words);

        scan.close();

        
        // int count = 0;

        //do runs first before the while
        // do{
        //     System.out.println(count);
        // }while (count == 1);
        


        // // while loops repeats until a trigger occurs 
        // while(count < 10) {
        //     System.out.println("count less than 10: " + count);
        //     count++;
        // }
    }
}
