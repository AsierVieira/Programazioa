package random;

import javax.sound.sampled.SourceDataLine;

public class Prog2 {
    public static void main(String[] args) {
    String[] izenak= {"Joritz","Manuel","Javier","Alejandro","Manolo","Nigui","Alfonso Williams"};
    double random;
    int aukeratuta;

    random=Math.random();
    aukeratuta=(int)(random*izenak.length);

    System.out.println("Izen aukeratua "+izenak[aukeratuta]+" izan da.");
    }

}
