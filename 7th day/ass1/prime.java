package ass1;
import java.util.Scanner;
public class prime {
    void output(){
        
        System.out.println("enter a number");
        
    }
    void check() {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int flag=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("the number "+num+" is prime");
        }
        else{
            System.out.println("the number"+num+" is not prime");
        }
    }
}

