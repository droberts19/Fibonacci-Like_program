package sample;

public class Main {

    public static void main(String[] args) {
        int numberOf = 10;

        System.out.println("Will write " + numberOf + " Fibonacci Strings");
        System.out.println("");

        for (int i = 0; i < numberOf; i++) {
            Numberz numberz = new Numberz(i+1, 10, 0, 1);
            numberz.run();
        }
    }

}
