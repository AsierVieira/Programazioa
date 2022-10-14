import java.util.Scanner;

public class Segida {
    public static void main(String[] args){
        
        int handiena,kopuru;
        

        Scanner in = new Scanner(System.in);
        System.out.println("Zein da imprimatu nahi duzun azken zenbakia?: ");
        handiena=in.nextInt();
        System.out.println("Zenbat zenbakiko multzoak nahi dituzu?: ");
        kopuru=in.nextInt();
        in.close();
        System.out.println(" ");

        for (int i = 1; i <= handiena; i++) {
            System.out.println(i);
            if (i% kopuru == 0) {
                System.out.println("====");
            }
        }
        

    }
}
