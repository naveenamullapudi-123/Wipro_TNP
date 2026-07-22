class EvenThread extends Thread {
    public void run() {
        System.out.println("Even numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start();

        try {
            even.join(); // Wait until even thread finishes
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        odd.start();
    }
}


