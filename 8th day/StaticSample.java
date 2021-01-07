
public class StaticSample {
    int a=10;
    static int b=20;
    public static void main(String[] args) {
        StaticSample h1=new StaticSample();
        StaticSample h2=new StaticSample();
        System.out.println(h1.a);
        h1.hello();
        h2.b=50;
        h1.a=100;

        h1.b=100;
        b=2500;
        System.out.println("h2.b: "+h2.b);
    }
    void hello(){

    }
}
