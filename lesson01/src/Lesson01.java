import java.util.Scanner;

// równy: ==
// mniejszy lub równy: >=
// i: &&
// podwójny nawias gdy wpisujemy dwie dane

public class Lesson01 {
    public static void main(String[] args) {
        System.out.println("Podaj swoj wiek: ");
        int wiek = new Scanner(System.in).nextInt();
        System.out.println("Twój wiek to: " + wiek);

        if (wiek < 0) return;
        if (wiek > 100) return;

        if (wiek < 20) {
            System.out.println("Jesteś młody");
        } else if (wiek >= 20) {
            System.out.println("Jesteś w średnim wieku lub stary");
        }

    }
}
