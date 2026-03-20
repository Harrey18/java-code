import java.util.Scanner;
public class prob1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b && b==c){
            System.out.println("all numbers are equals");
        }

        else if(a>=b && a>=c){
            System.out.println("greatest number is:"+a);

        }
        else if(b>=a && b>=c){
            System.out.println("greatest number is:"+ b);
        }
        else if(c>=a && c>=b){
            System.out.println("greatest number is:"+ c);
        }


    }

}