import java.util.Scanner;

public class eligible{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
        if (age>17){
            System.out.println("you can vote");
        
        }
        else{
            System.out.println("you can't vote");
        }
    
    }

}