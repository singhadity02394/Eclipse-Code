package threadEx;

public class YieldMethod extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+"--"+ i);
        }
    }
    public static void main(String[] args){
        YieldMethod y = new YieldMethod();
        y.start();

        for(int i=3;i<=8;i++){
            Thread.yield();


            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
