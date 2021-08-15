public class FibonacciArray {

    //returns fibonacci value for n
    static int fibonacci(int fn_1, int fn_2) {
        return fn_1 + fn_2;
    }

    static void show(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ", ");
        }
    }

    static int[] calculateFibonacciArray() {
        int[] fib = new int[20];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fibonacci(fib[i - 1], fib[i - 2]);
        }
        return fib;
    }

    public static void main(String[] args) {
        int[] fibonacciSequence = calculateFibonacciArray();
        show(fibonacciSequence);
    }
}
