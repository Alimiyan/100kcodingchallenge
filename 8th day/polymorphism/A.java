package polymorphism;

public class A {
    int a;
    void display(){
        System.out.println("its A");
    }
    A(){
        System.out.println("its constructor A");
    }
    B(int a){
        System.out.println("its argument construcor of A");
    }
}
