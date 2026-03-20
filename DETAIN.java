import java.util.Scanner;
public class DETAIN {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your attandance");
        int a=sc.nextInt();
    
    if(a<=100 || a>=0){
        System.out.println("enter right attandance");
    }

    else if(a>=75){
        System.out.println("Eligible");
    }
    else{
        System.out.println("detained");
    }
    
    }




}