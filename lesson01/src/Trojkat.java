import java.util.Scanner;
// 1: *
// 2: ***
// 3: *****
// 4: *******
// 5: *********
public class Trojkat {
    public static void main(String[] args) {
        int rows = new Scanner(System.in).nextInt();

        for (int i = 1; i < rows + 1; i++) {
            System.out.print(i + ": ");
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
