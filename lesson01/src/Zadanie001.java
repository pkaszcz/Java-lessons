import java.util.Scanner;

public class Zadanie001 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");
        int star = new Scanner(System.in).nextInt();
        int x = 0;

        while (x < star) {
            System.out.print("*");
            x++;
        }
    }
}
