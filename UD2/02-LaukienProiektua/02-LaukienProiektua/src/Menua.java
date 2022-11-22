import java.util.Scanner;

public class Menua {

    private static final int LAUKI_KOP = 10;
    private static int sortutakoak;
    private static Laukia[] laukiak = new Laukia[LAUKI_KOP];
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int aukera = 0;

        while (aukera != 5) {

            System.out.println("LAUKIAK");
            System.out.printf("\n==============================\n");
            System.out.println("1.-Lauki berria sortu");
            System.out.println("2.- Laukien taula ikusi");
            System.out.println("3.- Lauki bat marraztu");
            System.out.println("4.- Lauki handiena bilatu");
            System.out.println("5.-Irten");
            System.out.println("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();

            switch (aukera) {
                case 1:
                    sortu();
                    break;
                case 2:
                    imprimatu();
                    break;
                case 3:
                    marraztu();
                    break;
                case 4:
                    handiena();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                System.out.println("Aukera okerra. Saiatu berriz.");
            }

        }
        in.close();
    }

    public static void sortu() {
        int zab;
        int alt;

        if (sortutakoak <= 10) {
            System.out.println("LAUKI BERRIA SORTZEN...");
            System.out.println("Sartu zabalera: ");
            zab = in.nextInt();
            System.out.println("Sartu altuera: ");
            alt = in.nextInt();
            System.out.println(" ");

            laukiak[sortutakoak] = new Laukia(zab, alt);
            sortutakoak++;
        } else {
            System.out.println("Ezin duzu lauki gehiago egin. Eskerrik asko!!");
        }

    }

    public static void imprimatu() {

        System.out.printf(
                "\nLaukia\t    Zabalera\t    Altuera\t    Azalera\t    Perimetroa\t   Mota\n\n=====================================================================================================");

        for (int x = 0; x < laukiak.length; x++) {
            System.out.printf("\n%d\t\t%d\t\t%d\t\t%d\t\t%s\t\t%s\n", (x + 1), laukiak[x].getZabalera(),
                    laukiak[x].getAltuera(), laukiak[x].getAzalera(), laukiak[x].getPerimetroa(), laukiak[x].getMota());
        }
    }

    public static void marraztu() {

        int posizioa;
        String betetaHutsa;

        System.out.println("Zenbatgarren laukia nahi duzu marraztu?: ");
        posizioa = (in.nextInt() - 1);
        System.out.println("Beteta ala hutsik (B/H)? ");
        betetaHutsa = in.next();

        if (betetaHutsa.equals("B")) {

            laukiak[posizioa].marraztuBeteta(laukiak[posizioa]);

        } else {
            laukiak[posizioa].marraztuHutsik(laukiak[posizioa]);
        }

    }

    public static void handiena() {

        Laukia handiena = new Laukia();
        handiena = Laukia.getTheBiggest(laukiak);
        System.out.println("Laukirik handiena hau da: "+ handiena.toString());
    }
}