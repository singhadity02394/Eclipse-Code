package threadEx;

public class DaemonEx  extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()) {
            System.out.println("child Thread");
        }else{
            System.out.println("No demend thread");
        }
    }
    public static void main(String[] args){
        System.out.println("mainThread");
        DaemonEx d = new DaemonEx();
        d.setDaemon(true);
        d.start();
    }

}
