import java.util.Scanner;
public class prob5{
    
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
        if (sum%2==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        }

    }
