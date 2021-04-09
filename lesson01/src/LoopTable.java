public class LoopTable {

//    Napisz program tworzący "tabliczkę działań" (x od 0 do 10, y od 0 do 10) wypisanie napisu "\t" tworzy tabulator (odstęp)
//
//    X 	Y 	X+Y 	X-Y 	X*Y 	X/Y
//   0 	0 	0 	0 	0 	-
//        0 	1 	1 	-1 	0 	0
//        0 	2 	2 	-2 	0 	0
//        10 	10 	20 	0 	100 	1
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        System.out.println("x\t\ty\t\tx+y\t\tx-y\t\tx*y\t\tx/y");
        for (x = 0; x < 10; x++) {
           for (y = 0; y < 10; y++) {
               System.out.print(x + "\t\t" + y + "\t\t" + (x+y) + "\t\t" + (x-y) + "\t\t" + (x*y) + "\t\t");
               if (y != 0) {
                   System.out.println(x/y);
               } else {
                   System.out.println("-");
               }

           }
        }

    }
}
