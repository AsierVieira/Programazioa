import java.util.Scanner;

public class LaukiBatSortu {
    public static void main(String[] args) {
        int zaba, altu;
        Laukia l1;
        char carac;

        Scanner in = new Scanner(System.in);

        System.out.println("Sartu laukiaren zabalera:");
        zaba = in.nextInt();

        System.out.println("Sartu laukiaren altuera:");
        altu = in.nextInt();

        l1 = new Laukia(zaba, altu);

        System.out.println("Lauki karratua sortu duzu: => " + l1);
        System.out.println("Hona marrazkia beteta:");

        for (int row = 1; row <= zaba; row++) {
            for (int col = 1; col <= altu; col++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
        System.out.println("Hona marrazkia hutsik:");

        for (int row = 1; row <= zaba; row++) {
            for (int col = 1; col <= altu; col++) {
                if ((col == 1) || (col == altu) || (row == 1) || (row == zaba)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Zein ikurrekin nahi duzu laukia bete?");
        carac = in.next().charAt(0);

        for (int row = 1; row <= zaba; row++) {
            for (int col = 1; col <= altu; col++) {
                System.out.print(carac);
            }
            System.out.println();
        }
        in.close();
    }
}