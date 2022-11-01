import java.util.Scanner;

public class Segida {
    public static void main(String[] args) {
        
        int numTotal, numGrupos;

        Scanner in = new Scanner(System.in);
        System.out.print("Zein da inprimatu nahi duzun azken zenbakia? ");
        numTotal = in.nextInt();
        System.out.print("Zenbat zenbakiko multzoak nahi dituzu? ");
        numGrupos = in.nextInt();

        in.close();

        for (int i = 1; i <= numTotal; i++) {
            
            System.out.println(i);

            if(i%numGrupos==0){
                System.out.println( "=====" );
            }

        }
    }

}
