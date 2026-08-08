import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Reading a single line string
        System.out.print("Enter a sentence: ");
        String sentence = scn.nextLine();
        System.out.println("Entered Sentence: " + sentence);

        // Reading an integer
        System.out.print("Enter an integer: ");
        int x = Integer.parseInt(scn.nextLine());
        System.out.println("Entered Integer: " + x);

        // Reading a float value
        System.out.print("Enter a float value: ");
        float f = Float.parseFloat(scn.nextLine());
        System.out.println("Entered Float Value: " + f);

        scn.close();
    }
}