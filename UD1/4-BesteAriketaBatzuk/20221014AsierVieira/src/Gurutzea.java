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
        for (int i = 1; i <= lerroKopuru; i++) {
        if (lerroKopuru /2 +1 == i) {
            System.out.print(" "+lerroKopuru);
        }
        else{
            System.out.print(" . ");
        }
            
        }
    }

}
