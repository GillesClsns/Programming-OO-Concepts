import be.gilles.Fibonacci;
import be.gilles.FibonacciException;

public class Main {

    public static void main(String[] args) {

        try {
            Fibonacci.fibonacciGetal(-1);
        } catch (FibonacciException e) {
            System.out.println(e.getMessage());
        }
        try {
            for (int i = 0; i < 100; i++) {
                double deeltal = Fibonacci.fibonacciGetal(i + 1);
                long deler = Fibonacci.fibonacciGetal(i);
                System.out.printf("f(%d) / f(%d) = %.15f%n", i + 1, i, deeltal / deler);
            }
        } catch (FibonacciException e) {
            System.out.println(e.getMessage());
        }
    }
}
