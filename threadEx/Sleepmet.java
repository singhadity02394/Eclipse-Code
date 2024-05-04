package threadEx;

public class Sleepmet extends Thread{
    public void run(){
        for(int i =1;i<=6;i++){
            try{
                Thread.sleep(1000);
                System.out.print(".f");
            }catch (Exception e){
                System.out.println(e);

            }
        }

    }
    public static void main(String[] args){
        Sleepmet s = new Sleepmet();
        s.start();
    }

}
