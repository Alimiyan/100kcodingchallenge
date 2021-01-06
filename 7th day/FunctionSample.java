import java.util.Scanner;

public class FunctionSample {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int result=sum(num1,num2);
        System.out.println(result);
    }
    static int sum(int a,int b){
        int s=a+b;
        return s;
    }
}
