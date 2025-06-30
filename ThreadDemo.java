class Threading extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        Threading th = new Threading();
        th.start();
        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }
    }
}