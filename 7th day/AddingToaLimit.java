import java.util.Scanner;

public class AddingToaLimit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the limit");
        int limit=s.nextInt();
        int sum=0;
        for(int i=0;i<=limit;i++){
            sum=sum+i;
        }
        System.out.println("sum is: "+sum);
    }
}
