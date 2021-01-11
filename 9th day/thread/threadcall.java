public class threadcall {
    public static void main(String[] args) {
        SamplePr s1=new SamplePr(10);
        SamplePr s2=new SamplePr(20);
        SamplePr s3=new SamplePr(30);
        s1.start();
        s2.start();
        s3.start();
    }
}
