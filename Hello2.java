class Atm {
    synchronized public void checkBalance(String name) {
        System.out.println("Checking balance for " + name);
       try { Thread.sleep(1000);
        
       } catch (Exception e) {
        
       }
        System.out.println("Balance: $1000");
    }

    synchronized public void withdraw(String name, int amount) {
        System.out.println("Withdrawing " + amount + " for " + name);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            
        }

        System.out.println("Withdrawal successful. New balance: $900");
    }
}

class Customer extends Thread {
    String name;
    int amount;
    Atm atm;

    Customer(String n, int amt, Atm a) {
        name = n;
        amount = amt;
        atm = a;
    }

    public void useAtm() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run() {
        useAtm();
    }
}

class Hello2 {
    public static void main(String[] args) {
        // Example usage of the Syncronisation class

        Atm atm = new Atm();
        Customer c1 = new Customer ("Nehal", 100, atm);
        Customer c2 = new Customer ("Aman", 200, atm);
        c1.start();
        c2.start();
       
    }

}