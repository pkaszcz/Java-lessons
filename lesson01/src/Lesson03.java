public class Lesson03 {
    //Pętle
    public static void main(String[] args) {
        int x = 0;

        while (x < 4) {
            System.out.print("*");
            x++;
        }
        // while najpierw sprawdza warunek, a później wykonuje pętle
        // do...while najpierw wykonuje przynajmniej raz pętle, a później sprawdza warunek
        // zwiększenie x o jeden to "x++" lub "x += 1"


        do {
            System.out.print("*");
        } while (x < 4);

        for (x = 0; x < 4; x += 2) {
            System.out.println("*");
        }
    }
}
