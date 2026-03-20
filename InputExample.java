import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

       
        System.out.println("Enter a decimal number: ");
        double decimal = sc.nextDouble();

        
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        
        System.out.println("Enter a word: ");
        String word = sc.next();

       
        System.out.println(" Output ");
        System.out.println("Number: " + num);
        System.out.println("Decimal: " + decimal);
        System.out.println("Character: " + ch);
        System.out.println("Word: " + word);

        
    }
}

