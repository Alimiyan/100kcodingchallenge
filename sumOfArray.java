import java.util.Scanner;
public class sumOfArray {
    public static void main(String[] args) {
        int a[]=new int[100];
        int limit,i,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.print("enter the  limit\n");
        limit=s.nextInt();
        System.out.print("enter the elements\n");
        for(i=0;i<limit;i++){
            a[i]=s.nextInt();
            sum=sum+a[i];
        }
        System.out.println("sum of array is:"+sum);
    }
}
