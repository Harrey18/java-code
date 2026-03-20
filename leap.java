import java.util.Scanner;

public class leap{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year");
        int year = sc.nextInt();

        if (year%100==0){
            if(year%400==0){
                System.out.println("leap yaer");
            }

            else {
                System.out.println("not leap");
            }
        }
        else{
            if(year%4==0){
                System.out.println("leap year");

            }
            else{
                System.err.println("not leap");
            }
        }

    }
}