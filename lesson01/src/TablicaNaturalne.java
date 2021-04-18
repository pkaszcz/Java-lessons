public class TablicaNaturalne {
    // ciąg artmetyczny
    public static void main(String[] args) {
        int[] tab = new int[20];
        int len = tab.length;
        for (int i = 0; i < len; i++) {
            //0 2 4 6 8 10 12 14 16 18
            tab[i] = i + 1;

        }

        System.out.print("tablica:{");

        for (int i = 0; i < len; i++) {
            System.out.print(tab[i]);
            if (i < len - 1) System.out.print(",");
        }
        System.out.print("}");
    }

}