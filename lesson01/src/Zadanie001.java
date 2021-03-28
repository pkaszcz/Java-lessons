import java.util.Scanner;

public class Zadanie001 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");
        int star = new Scanner(System.in).nextInt();


//        while (x < star) {
//            System.out.print("*");
//            x++;
//        }
        for (int i = 0; i < star; i++) {
            System.out.println("*");
        }
    }
}
