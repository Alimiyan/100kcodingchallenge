package polymorphism;

public class B extends A{
    int a;
    B(){
        System.out.println("its constructor B");
    }
    B(int a){
        System.out.println("its argument constructor of B");
    }
    void display(){
        System.out.println("its B");

        a=20;
        super.a=30;
        int c=a+super.a;
        System.out.println(c);
    }
    void basedisplay(){
        super.display();
        
    }
    public static void main(String[] args) {
        B b=new B();
        B b1=new B(10);
        b.display();
        //methord overriding
        //only displays the subclass function
        b.basedisplay();
    }
}
