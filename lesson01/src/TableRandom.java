import java.util.Random;

public class TableRandom {
    public static void main(String[] args) {
        int[] tab = new int[20];
        int len = tab.length;
        int max = -1000;
        int min = 1000;

        for (int i = 0; i < len; i++) {
            tab[i] = new Random().nextInt(100) + 1;
            if (tab[i] > max) max = tab[i];
            if (tab[i] < min) min = tab[i];
        }

        System.out.print("tablica:{");

        for (int i = 0; i < len; i++) {
            System.out.print(tab[i]);
            if (i < len - 1) System.out.print(",");
        }
        System.out.print("}");
        System.out.println();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
