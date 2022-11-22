import java.util.Scanner;

public class LaukiAskoSortu {
    public static void main(String[] args) {

        int laukiKopuru;
        Laukia[] laukiak;
        int zabalera;
        int altuera;

        Scanner in = new Scanner(System.in);

        System.out.print("Zenbat lauki sortu nahi dituzu?: ");
        laukiKopuru = in.nextInt();

        laukiak = new Laukia[laukiKopuru];

        for (int i = 0; i < laukiak.length; i++) {
            System.out.println(i + 1 + ". Laukiaren datuak: ");
            System.out.print("Zabalera: ");
            zabalera = in.nextInt();
            System.out.print("Altuera: ");
            altuera = in.nextInt();
            laukiak[i] = new Laukia(zabalera, altuera);
        }
        System.out.printf(
                "\nLaukia\t    Zabalera\t    Altuera\t    Azalera\t    Perimetroa\t   Mota\n\n=====================================================================================================");

        for (int x = 0; x < laukiak.length; x++) {
            System.out.printf("\n%d\t\t%d\t\t%d\t\t%d\t\t%s\t\t%s\n", (x + 1), laukiak[x].getZabalera(),
                    laukiak[x].getAltuera(), laukiak[x].getAzalera(), laukiak[x].getPerimetroa(), laukiak[x].getMota());
        }
        in.close();
    }
}
