import java.util.Scanner;

public class IfSample {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int num=s.nextInt();
        if(num<0){
            System.out.println("entered number is negative");
        }
        else{
            System.out.println("entered number is positive");
        }
    }    
}
