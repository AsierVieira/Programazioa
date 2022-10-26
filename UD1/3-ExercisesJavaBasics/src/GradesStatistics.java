import java.util.Scanner;

public class GradesStatistics {

    public static void main(String[] args) {

        // Aldagaien deklarazioak
        final int NUM_ITEMS;
        int[] grades;
        int sum;// Nota guztien batura
        double average;
        int min,max;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        NUM_ITEMS = in.nextInt();

        grades = new int[NUM_ITEMS];

        // erabiltzaileari notak eskatuko diszkiogu.Gaur ez dugu sarrera balidatuko

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter the grade " + (i + 1) + ": ");
            grades[i] = in.nextInt();
        }
        in.close();// ya no se piden más datos

        // average kalkulatzeko
        sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
            
        }
        average = sum/ (double)NUM_ITEMS;

        System.out.printf("The average is: %.2f", average);

        //Minimoaren kalkuloa

        min=grades[0];
        for(int i= 0;i < grades.length;i++){
            
        }

    }
}
