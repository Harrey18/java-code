import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int result;
        if (choice == 1) {
            result = num1 + num2;
           // System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (choice == 2) {
            result = num1 - num2;
          //  System.out.println(num1 + " - " + num2 + " = " + result);
        } else if (choice == 3) {
            result = num1 * num2;
           // System.out.println(num1 + " * " + num2 + " = " + result);
        } else if (choice == 4) {
            if (num2 != 0) {
                result = num1 / num2;
                //System.out.println(num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Error: Division by zero!");
            }
        } else {
            System.out.println("Invalid choice!");
        }
        System.out.println("RESULT" result);
    }
}