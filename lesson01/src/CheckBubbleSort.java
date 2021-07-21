import java.util.Random;

public class CheckBubbleSort {

    static int[] generateRandomArray() {
        int[] tab = new int[20];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(100) + 1;
            System.out.print(tab[i] + " ");
        }
        return tab;
    }

    static int[] sort(int[] tab) {
        int len = tab.length;
        int indexHead = 0;
        int indexI = 0;

        for (int j = 0; j < len - 1; j++) {
            for (int i = indexHead; i < len - 1; i++) {
                indexI = tab[i];
                if (tab[i] > tab[i + 1]) {
                    tab[i] = tab[i + 1];
                    tab[i + 1] = indexI;
                }
            }
        }
        return tab;
    }

    static boolean isSorted(int[] tab) {
        boolean isSorted = true;
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] > tab[i + 1]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    static void show(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] tab = generateRandomArray();
        System.out.println();
        tab = sort(tab);
        show(tab);
        System.out.println("");
        System.out.println("is sorted = " + isSorted(tab));
    }
}
