public class forLoop {
    public static void main(String[] args) {
        
        //repeat code with for loop. how many times you want to repeat the code.
        for (int i = 0; i < 10; i++) {
            System.out.println("I love you");
        }

        //code will repeat twice
        for(int i = 0; i < 2; i++){
            System.out.println(i);
        }

        
        int[] marks = {98, 40, 100, 70};

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
