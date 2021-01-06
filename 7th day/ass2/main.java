package ass2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        cal ca=new cal();
        System.out.println("enter two numbers");
        float num1=s.nextFloat();
        float num2=s.nextFloat();
        System.out.println("enter the operation: \n1 for additon \n2 for sub \n3 for mul \n4 for div\n");
        float op=s.nextFloat();
        ca.calculate(num1,num2,op);
        ca.display();
        
    }
    
}
