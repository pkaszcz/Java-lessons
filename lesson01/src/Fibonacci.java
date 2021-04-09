import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int nMax = new Scanner(System.in).nextInt();
        int n2 = 0; //n - 2
        int n1 = 1; //n - 1
        int f = 1928; //wartość F(n)

        if (nMax < 0) return;
        if (nMax > 20) return;

        if (nMax == 0) System.out.print("0");
        if (nMax >= 1) System.out.print("0 1 ");

        //0 1 1 2 3 5 8 13

        for (int n = 2; n < nMax; n++) {
            f = n1 + n2;
            System.out.print(f + " ");
            n2 = n1;
            n1 = f;

        }
        System.out.println();
    }
}
