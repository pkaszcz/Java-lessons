import java.util.Scanner;

public class Romb {
    public static void main(String[] args) {
        int rows = new Scanner(System.in).nextInt();
        if (rows > 9) return;

        for (int i = 1; i < rows + 1; i++) {
//            System.out.print(i + ": ");

            for (int s = 0; s < rows - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = rows - 1; i >= 0; i--) {

            for (int s = 0; s < rows - i; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

