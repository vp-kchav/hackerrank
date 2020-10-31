package hackerank.basic;

public class SampleDemo  implements Runnable{
    Thread t;
    String name;

    SampleDemo(String name) {
        this.name = name;

    }

    @Override
    public void run() {
        while(true) {
            System.out.println(name);
        }
    }

    public void start() {
        if(t ==null){
            t = new Thread(this,name);
            t.start();
        }
    }
}
