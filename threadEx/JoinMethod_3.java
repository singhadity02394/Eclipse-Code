package threadEx;
class Ex1 extends Thread{
    public void run(){
        try{
            System.out.println("Hello boys");
            Thread.sleep(2000);
            System.out.println("Good ");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class Ex2 extends Thread{
    public void run(){
        try{
            System.out.println("Hello brother");
            Thread.sleep(2000);
            System.out.println("Good ");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class Ex3 extends Thread {
    public void run() {
        try {
            System.out.println("Hello brotherr");
            Thread.sleep(2000);
            System.out.println("Good ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


public class JoinMethod_3 {
    public static void main(String[] args) throws InterruptedException{
        Ex1 e = new Ex1();
        e.start();
        e.join();
        Ex2 h = new Ex2();
        h.start();
        h.join();

        Ex3 b = new Ex3();
        b.start();

    }
}
