import java.util.Scanner;

public class TablicaDodatnieUjemne {
    public static void main(String[] args) {
        int[] tab = new int[new Scanner(System.in).nextInt()];
        int len = tab.length;
        int x = 1;
        for (int i = 0; i < len; i++) {
            //tablica:{1, -2, 3, -4, 5, -6, ...}
            tab[i] = x;
            x += 1;
        }

            System.out.print("tablica:{");

            for (int i = 0; i < len; i++) {

                if (tab[i] % 2 == 0) { tab[i] *= -1;}

                System.out.print(tab[i]);

                if (i < len - 1) System.out.print(",");
            }
            System.out.print("}");

        }
    }



