package sample;

public class Main {

    public static void main(String[] args) {
        int numberOf = 9;

        System.out.println();
        System.out.println("Will write " + numberOf + " Fibonacci Strings");

        for (int i = 0; i < numberOf; i++) {
            Numberz numberz = new Numberz(15, i+0, 1);
            numberz.run();
            //Thread t = new Thread(numberz);
            //t.start();
            System.out.println();
        }
    }

}
