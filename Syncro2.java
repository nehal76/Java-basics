class Phone{
    
    synchronized public void use(String name){

        System.out.println(name + " is using the phone.");
        
    }
}

class User1 extends Thread{
    String name;
    public User1(String n){
       System.out.println("Hello world");
    }
    public void run(){
        Phone p = new Phone();
        p.use(name);
    }
}

class User2 extends Thread{
    String name;
    public User2(String n){
        name = n;
    }
    public void run(){
        Phone p = new Phone();
        p.use(name);

    }
}


public class Syncro2 {

    public static void main(String[] main){
        Phone p = new Phone();
        User1 u1 = new User1("Alice");
        User2 u2 = new User2("Bob");
        u1.start();
        u2.start();
    }
    
}
