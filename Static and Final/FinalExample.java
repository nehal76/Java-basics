// Final VVariable can not be changed once initialized.
// Final Method can not be overridden in child class.
// Final Class can not be inherited by child class.
// Final variables are constants in Java.

class Test {
    final public void display() {
        System.out.println("This is a final method");
    }

    public Test() {
        System.out.println("Test class constructor called");
    }
}

class TestChild extends Test {
    // public void display(){
    // System.out.println("Can not overwride final display method");
    // }

    public void show() {
        System.out.println("This is a show method");
    }
}

public class FinalExample {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.display();
       

        TestChild t2 = new TestChild();
        t2.show();
    }

}
