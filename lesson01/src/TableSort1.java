import java.util.Random;

public class TableSort1 {
    public static void main(String[] args) {
        int[] tab = new int[20];
        int len = tab.length;
        int max = 0;
        int indexHead = 0;
        int indexMax = 0;
        int old = 0;

        for (int i = 0; i < len; i++) {
            tab[i] = new Random().nextInt(100) + 1;
            System.out.print(tab[i] + " ");
        }
        max = tab[0];
        System.out.println();

        for (int j = 0; j < len - 1; j++) {
            // szukanie wartości max - start
            for (int i = indexHead; i < len; i++) {
                if (tab[i] > max) {
                    max = tab[i];
                    indexMax = i;
                }
            } //szukanie wartości max - end

            //swapowanie liczby w tabeli
            old = tab[indexHead];
            tab[indexHead] = tab[indexMax];
            tab[indexMax] = old;
//            sortedTab[indexHead] = max;

            //przesuwanie indeksu head
            indexHead += 1;
            max = tab[indexHead];
        }
        //foreach
        for (int i = 0; i < len; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
