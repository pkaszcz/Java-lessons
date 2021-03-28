import java.util.Scanner;

public class Zadanie003 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        int x = new Scanner(System.in).nextInt();
        int suma = 0;

        for (int i = 0; i <= x; i += 1) {
            suma += i;
        }
        System.out.println("Suma = " + suma);
    }
}

