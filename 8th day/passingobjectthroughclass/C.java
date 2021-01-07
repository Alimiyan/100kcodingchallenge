package passingobjectthroughclass;

public class C {
    public static void main(String[] args) {
        A obj=new A();
        B b=new B();
        b.display(obj);
    }
}
