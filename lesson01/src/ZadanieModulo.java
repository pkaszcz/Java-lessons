public class ZadanieModulo {
    public static void main(String[] args) {
        int x = 3;

        System.out.println("Reszta z dzielania przez 3 = " + x % 3);

        if (x % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

    }
}
