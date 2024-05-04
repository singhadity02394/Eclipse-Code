package threadEx;

public class JoinMethod extends Thread{
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() +"   "+i);
                Thread.sleep(1000);
            }
            }catch(Exception e){
                System.out.println("Exception");
            }
        }

        public static void main(String[] args) throws InterruptedException{
        JoinMethod j = new JoinMethod();
        j.start();
            j.join();


        try{
            for(int i=1;i<=4;i++){
                System.out.println(Thread.currentThread().getName()+ "Jai Shre Ram");
                Thread.sleep(1000);



            }
        }catch(Exception e){
            System.out.println("Sorry ");
        }
        }

}
