public class TableSwap {

    // tablica wyjściowa:{100,...,16,9,4,1}.

    public static void main(String[] args) {
        int[] tab = new int[20];
        int[] tab2 = new int[20];
        int len = tab.length;

        System.out.print("tablica:{");
        for (int i = 0; i < len; i++) {
            tab[i] = i + 1;
            System.out.print(tab[i]);
            if (i < len - 1) System.out.print(",");
        }
        System.out.println("}");

        System.out.print("tablica:{");
        for (int i = 0; i < len; i++) {
            tab2[i] = tab[len - i - 1];
            System.out.print(tab2[i]);
            if (i < len - 1) System.out.print(",");
        }
        System.out.println("}");

        // odwracanie tablicy w miejscu
        int old = -1000;
        for (int i = 0; i < (len / 2); i++) {
            old = tab[i];
            tab[i] = tab[len - i - 1];
            tab[len - i - 1] = old;
        }

        System.out.print("tablica:{");
        for (int i = 0; i < len; i++) {
            System.out.print(tab[i]);
            if (i < len - 1) System.out.print(",");
        }
        System.out.println("}");
    }
}
