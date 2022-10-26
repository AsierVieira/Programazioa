import java.util.Scanner;

public class Gurutzea {
    public static void main(String[] args) {

         // for ( int row= 1; row <= lerroKopuru; row++) {
            // System.out.println(lerroKopuru);
            // for ( int col= 1; col <=lerroKopuru; col++) {
            // System.out.println(".");
        int lerroKopuru;

        Scanner in = new Scanner(System.in);
        System.out.println("Zein da imprimatu nahi duzun azken zenbakia?: ");
        lerroKopuru = in.nextInt();
        in.close();
        for (int row= 1; row <= lerroKopuru; row++){
            for (int col = 1; col <= lerroKopuru; col++) {
                if ((lerroKopuru + 1) / 2 == col) {
                    System.out.print("0 ");
        } else if ((lerroKopuru + 1) / 2 == row) {
                    System.out.print("0 ");
        } else {
            System.out.print(". ");
        }
            }
            System.out.println("");
        }
    }
}
