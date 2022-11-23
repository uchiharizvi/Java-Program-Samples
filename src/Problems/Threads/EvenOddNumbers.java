package Problems.Threads;

public class EvenOddNumbers {
    int counter = 1;
    static int n;

    public static void main(String[] args) {
        n = 10;
        EvenOddNumbers evenOddNumbers = new EvenOddNumbers();
        //Create Thread T1
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                evenOddNumbers.printEvenNumbers();
            }
        });
        //Create Thread T2
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                evenOddNumbers.printOddNumbers();
            }
        });
        t1.start();
        t2.start();
    }

    private void printOddNumbers() {
        synchronized (this) {
            while (counter < n) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter + " ");
                counter++;
                notify();
            }
        }
    }

    private void printEvenNumbers() {
        synchronized (this) {
            while (counter < n) {
                while (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter + " ");
                counter++;
                notify();
            }
        }
    }
}
