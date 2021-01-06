package ass2;
public class cal {
    float sum;
    void calculate(float num1,float num2,float op){
        if(op==1){
            sum=num1+num2;
            System.out.println(sum);
        }
        else if(op==2){
            sum=num1-num2;
            System.out.println(sum);
        }
        else if(op==3){
            sum=num1*num2;
            System.out.println(sum);
        }
        else if(op==4){
            sum=num1/num2;
            System.out.println(sum);
        }
        else{
            System.out.println("invaalid");
        }
 
    }
    void display(){
        System.out.println("the result is  "+sum);
    }
}
