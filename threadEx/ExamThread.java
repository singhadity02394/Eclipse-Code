package threadEx;

class OddNumberPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd number: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenNumberPrinter implements Runnable {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even number: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquarePrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Square of " + i + ": " + (i * i));
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ExamThread {
    public static void main(String[] args) {




        Thread oddThread = new Thread(new OddNumberPrinter());
        Thread evenThread = new Thread(new EvenNumberPrinter());
        Thread squareThread = new Thread(new SquarePrinter());


        oddThread.start();
        evenThread.start();
        squareThread.start();

        System.out.println("Current Thread "+ Thread.currentThread());
        System.out.println("Thread " + oddThread.getName() + ' ' +oddThread.getState());
        System.out.println("Thread " + evenThread.getName() + ' ' +evenThread.getState());
        System.out.println("Thread " + squareThread.getName() + ' ' +squareThread.getState());

        //set the perority
        oddThread.setPriority(6);
        evenThread.setPriority(4);
        squareThread.setPriority(7);

        System.out.println("Current Thread "+ Thread.currentThread());
        System.out.println("Thread " + oddThread.getName() + ' ' +oddThread.getState());
        System.out.println("Thread " + evenThread.getName() + ' ' +evenThread.getState());
        System.out.println("Thread " + squareThread.getName() + ' ' +squareThread.getState());




    }
}
