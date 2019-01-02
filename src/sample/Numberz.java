package sample;

public class Numberz implements Runnable{
    private int max;
    private int number1;
    private int number2;

    Numberz(int maximum, int number1a, int number2a) {
        max = maximum;
        number1 = number1a;
        number2 = number2a;
    }

    private void writeThing() {
        for (int a = 1; a <= max; ++a) {
            System.out.print(number1 + " ");
            int sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }
        /*try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }*/
    }

    public void run() {
        writeThing();
    }
}