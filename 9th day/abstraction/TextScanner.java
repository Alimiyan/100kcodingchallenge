

public class TextScanner {
    Hello obj;
    public TextScanner(Hello obj){
        this.obj=obj;
    }
    void Scan(){
        obj.onText("scanned text");
    }
}
