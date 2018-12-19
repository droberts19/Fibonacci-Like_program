package sample;

public class Numberz implements Runnable{
    private int whichOne;
    private int max;
    private int number1;
    private int number2;

    Numberz(int whichString, int maximum, int number1a, int number2a) {
        whichOne = whichString;
        max = maximum;
        number1 = number1a;
        number2 = number2a;
    }

    private void writeString() {
        for (int a = 1; a <= max; ++a) {
            System.out.print(number1 + " ");
            int sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println();
    }

    public void run() {
        System.out.print("Fibonacci String " + whichOne + " with " + max + " numbers: ");
        writeString();
    }
}