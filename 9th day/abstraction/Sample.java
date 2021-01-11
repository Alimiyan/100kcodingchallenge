
public class Sample extends Hello{
    void onText(String text){
        System.out.println(text);
    }
    Sample(){
        TextScanner t=new TextScanner(this);
        t.Scan();
    }
    public static void main(String[] args) {
        Sampleint s=new Sampleint();

    }
}
