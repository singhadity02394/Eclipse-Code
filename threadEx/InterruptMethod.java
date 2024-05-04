package threadEx;
class Exxam extends Thread{
    public void run(){
        try {
            for (int i = 1; i <= 4; i++) {
                System.out.println(i);
                Thread.sleep(1500);
            }
        }catch (Exception e){
            System.out.println("Exception ");
        }
    }
}

public class InterruptMethod {
    public static void main(String[] args){
        Exxam e = new Exxam();
        e.start();
        e.interrupt();
    }
}
