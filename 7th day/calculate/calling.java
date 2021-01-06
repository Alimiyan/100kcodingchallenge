package calculate;

import java.util.Scanner;

public class calling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sumc s=new sumc();
        System.out.println("enter two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        s.calcSum(num1, num2);
        s.display();
    }
}
