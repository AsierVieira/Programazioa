import java.util.Scanner;

public class Izenak2 {
    public static void main(String[] args) {

        String[] planetas; //inicio el array
        planetas = new String[8];
        String letra;

        Scanner in = new Scanner(System.in);
        System.out.print("Idatzi 8 izen: ");

        for (int index = 0; index < planetas.length; index++) {
            planetas[index] = in.next();
        }
        System.out.print("Sakatu R(everse) izenak atzekoz aurrera ikusteko: ");
        letra = in.next().toUpperCase();
        if (letra.equals("R")) {
            for (int index = 7, y = 1; index >= 0; index--, y++) {
                System.out.println(y + "- " + planetas[index]);
            }   
        }
    }
}
