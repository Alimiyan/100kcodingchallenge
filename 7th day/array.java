import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[100];
        int i;
        System.out.println("enter the limit");
        int limit=s.nextInt();
        System.out.println("enter the elements");
        for(i=0;i<limit;i++){
            a[i]=s.nextInt();
            System.out.println("the array is "+a[i]);
        }
    }
    
}
