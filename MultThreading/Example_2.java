// Multithreding using Runnable interface

package MultThreading;


class Test implements Runnable{
    public void run(){
        int i = 1;
        while(true){
            System.out.println("Child thread is running " + i);
            i++;
        }
    }

}

public class Example_2 {
    public static void main(String[] args){
        Test t1 = new Test();
        Thread th = new Thread(t1);
        th.start();

        int i =1;
        while(true){
            System.out.println("Main thread is running " + i);
            i++;
        }

    }
    
}
