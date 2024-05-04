package threadEx;

class Square extends Thread {
    int[] arr = {1, 20, 50, 15, 30};

    public void run() {
        System.out.println("Squares of numbers in the array:");
        for (int num : arr) {
            System.out.println(num + " squared: " + (num * num));
        }
    }
}

class AverageThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        double average = (double) sum / 10;
        System.out.println("Average of first 10 numbers: " + average);
    }
}


public class Lab10{
    public static void main(String[] args) {
        // Creating objects of the threads
        AverageThread averageThread = new AverageThread();
        Square squareThread = new Square();

        // Starting the threads
        averageThread.start();
        squareThread.start();

        try {
            // Waiting for the threads to finish
            averageThread.join();
            squareThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

