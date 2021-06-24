import java.util.Random;

public class TableBubbleSort {
    public static void main(String[] args) {
        int[] tab = new int[20];
        int len = tab.length;
        int indexHead = 0;
        int indexI = 0;

        for (int i = 0; i < len; i++) {
            tab[i] = new Random().nextInt(100) + 1;
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        for (int j = 0; j < len - 1; j++) {
            for (int i = indexHead; i < len - 1; i++) {
                indexI = tab[i];
                if (tab[i] > tab[i + 1]) {
                    tab[i] = tab[i + 1];
                    tab[i + 1] = indexI;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
