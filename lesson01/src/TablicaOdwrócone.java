public class TablicaOdwrócone {

    // tablica wyjściowa:{100,...,16,9,4,1}.

    public static void main(String[] args) {
        int[] tab = new int [10];

        int len = tab.length;
        int x = 1;
        for (int i = 0; i < len; i++) {

            tab[i] = x;
            x += 1;
        }

        System.out.print("tablica:{");

        for (int i = 0; i < len; i++) {
            System.out.print(tab[i] * tab[i]);
            if (i < len - 1) System.out.print(",");
        }





    }
}
