package sample;

public class Main {

    public static void main(String[] args) {
        int numberOf = 5;

        System.out.println();
        System.out.println("Will write " + numberOf + " Fibonacci Strings");

        for (int i = 0; i < numberOf; i++) {
            Numberz numberz = new Numberz(5, i+0, 1);
            Thread t = new Thread(numberz);
            t.start();
            System.out.println();
        }
    }

}
