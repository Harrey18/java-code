import java.util.Scanner;

public class SWAP{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b= sc.nextInt();

        swapWithThird(a,b);
        swapWithoutThird1(a,b);
        swapWithoutThird2(a,b);

    }


  public static void swapWithThird(int a, int b) {
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("Swap using third variable:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void swapWithoutThird1(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swap without third variable mithod 1:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void swapWithoutThird2(int a, int b) {

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("Swap without third variable method 2:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}