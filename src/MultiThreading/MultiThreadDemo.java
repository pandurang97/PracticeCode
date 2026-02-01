package MultiThreading;

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("HI");
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadDemo {

    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}