import java.util.Scanner;

public class Izartxoak {
    public static void main(String[] args) {

        int numTotal;

        Scanner in = new Scanner(System.in);
        System.out.print("Esan zenbaki bat (1-10): ");
        numTotal = in.nextInt();
        in.close();

        for (int i = 1; i <= numTotal; i++) { //saco todos los números
           
        // me falta ponerle una * cada vez que i = multiplo de numTotal
            System.out.print(i);

            if(i>i-1){ //entre número y número le pongo un -
                System.out.print("-");
            }
          
        }
    }
}
