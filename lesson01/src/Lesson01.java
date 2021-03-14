import java.util.Scanner;

public class Lesson01 {
    public static void main(String[] args) {
        System.out.println("Podaj swoj wiek: ");
        int wiek = new Scanner(System.in).nextInt();
        System.out.println("Twój wiek to: " + wiek);

        // równy: ==
        // mniejszy lub równy: >=
        // i: &&

        // podwójny nawias gdy wpisujemy dwie dane

        if ((wiek > 0) && (wiek < 20)) {
            System.out.println("Jesteś młody");
        } else if (wiek >= 20) {
            System.out.println("Jesteś w średnim wieku lub stary");
        } else {
            System.out.println("Wprowadziłeś zły wiek");
        }

    }
}
