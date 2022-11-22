package random;


public class Prog1 {
    public static void main(String[] args) {
        int zut1;
        double zut2;
        int zut3;//bitarra
        int zut4;// bitarra
        int zut5;
        String zut6;//txanpona
       // double z1=4.3;
        //int z2=(int)z1; esto es para castear el pasar de double a int

        
        System.out.printf("%2s  %20s %12s %12s %12s %12s\n","idx", "Math Random","Bitarra","Bitarra", "Dadoa","Txanpona");
        System.out.println("=======================================================================");
        

        for(int i=1;i<=20;i++){
            zut1=i;
            zut2= Math.random();
            if(zut2<=0.5){
                zut3=0;
                zut6="Aurpegia";
            }else{
                zut3=1;
                zut6="Gurutzea";
            }

            zut4=(zut2<0.5)?0:1;

            zut5=(int)(zut2*6)+1;// multiplico por 6 y saco los numeros del 0 al 5. Y para convertirlo del 1 al 6 le sumo 1.

            

            System.out.printf("%2d) %20.20f  %12s  %12s %12s %12s\n\n",zut1,zut2,zut3,zut4,zut5,zut6);
        }
        
    }
}
