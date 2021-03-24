import java.util.Scanner;

public class Zadanie002 {
    public static void main(String[] args) {
        System.out.println("Podaj dwie liczby");
        int x = new Scanner(System.in).nextInt();
        int y = new Scanner(System.in).nextInt();
        for (int i = x; i <= y; i += 1) {
            System.out.println(i);

        }
    }
}
