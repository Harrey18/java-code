import java.util.Scanner;
public class prob3{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum=0;
        int rev;
        while (num>0) {
            rev=num%10;
            sum=sum+rev;
            num=num/10;
            

            
        }
        System.out.println(sum);

    }
}