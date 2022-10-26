
public class HolaMundo {

    public static void main(String[] args) {
        java.util.Scanner in;
        int n;

        in = new java.util.Scanner(System.in);

        System.out.print("Número de veces escrito Hola Mundo ");
        n = in.nextInt();

        in.close();

        for (int i = 0; i < n; ++i) {
            System.out.println("Hola mundo.");
        }

    }
}