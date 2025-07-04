// Example of multithreading in Java using Extending Thread.

class Test extends Thread {
    public void run() {
        System.out.println("Thread is running");
        int i = 1;
        while (true) {
            System.out.println("Child thread is running " + i);
            i++;

        }
    }
}

public class Example_1 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.start();
        int i = 1;
        while (true) {
            System.out.println("Main thread is running " + i);
            i++;
        }

    }

}
