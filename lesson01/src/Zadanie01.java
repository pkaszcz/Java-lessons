import java.util.Random;
import java.util.Scanner;

public class Zadanie01 {
    public static void main(String[] args) {

        int wiek = new Random().nextInt(100) + 1;

        int liczba = 0;

        while (liczba != wiek) {
            System.out.println("Podaj liczbe: ");
            liczba = new Scanner(System.in).nextInt();
            if (liczba > wiek) {
                System.out.println("Podana liczba jest za duża");
            } else if (liczba < wiek) {
                System.out.println("Podana liczba jest za mała");
            } else {
                System.out.println("Zgadłeś!");
                return;
            }
        }
    }
}
