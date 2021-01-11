public class SamplePr extends Thread {
    int a;
    SamplePr(int a){
        this.a=a;
    }
    @Override
    public void run() {
        super.run();
        for(int i=0;i<10;i++){
            System.out.println("Thread count "+i+" value "+a);
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}

