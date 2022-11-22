
public class Laukia {
    private int zabalera;
    private int altuera;

    public Laukia() {
        zabalera = 5;
        altuera = 5;
    }

    public Laukia(int zab, int alt) {
        zabalera = zab;
        altuera = alt;
    }

    public int getZabalera() {
        return zabalera;
    }

    public int getAltuera() {
        return altuera;
    }

    public int getAzalera() {
        int azalera;
        azalera = zabalera * altuera;
        return azalera;
    }

    public int getPerimetroa() {
        int perimetroa;
        perimetroa = zabalera * 2 + altuera * 2;
        return perimetroa;
    }

    public void setZabalera(int zabaleraBerria) {
        zabalera = zabaleraBerria;
    }

    public void setAltuera(int altueraBerria) {
        altuera = altueraBerria;
    }

    public String toString() {
        return "Laukia[" + zabalera + "x" + altuera + "]";
    }

    public String getMota() {
        String Mota;
        if (altuera == zabalera) {
            Mota = "Karratua";
            return Mota;
        } else if (altuera > zabalera) {
            Mota = "Bertikala";
            return Mota;
        } else {
            Mota = "Horizontala";
            return Mota;
        }
    }
    public void marraztuBeteta(Laukia l1){
        for (int y=0; y< l1.getAltuera();y++){
            for( int x=0; x< l1.getZabalera(); x++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public void marraztuHutsik(Laukia l1){
        for (int y=0; y< l1.getAltuera();y++){
            for(int x=0; x< l1.getZabalera();x++){
                if((x==1)|| (y==1)||(x==l1.getAltuera())||(y==l1.getZabalera())){
                    System.out.print("* ");
                }else{
                    System.out.print("");
                }
            }
            System.out.println();
        }

    }

    public void marraztuBeteta(char ikurra) {

        for (int row = 1; row <= zabalera; row++) {
            for (int col = 1; col <= altuera; col++) {
                System.out.print(ikurra);
            }
            System.out.println();
        }
    }

    public String laukiBetea() {
        String laukiBetea="";

        for (int row = 1; row <= zabalera; row++) {
            for (int col = 1; col <= altuera; col++) {
                laukiBetea += " * ";
            }

            laukiBetea +=" \n";
        }
        return laukiBetea;
    }
    public boolean isBiggerThan(Laukia l1){
        boolean handiago= false;
        if(this.getAzalera()>l1.getAzalera()){
            handiago=true;
        }
        return handiago;
    }

    public static Laukia getTheBiggest(Laukia[]laukiak){
        
        Laukia max= laukiak[0];
        
        for( int index= 1; index<laukiak.length && laukiak[index] !=null; index++){
            if (laukiak[index].isBiggerThan(max)){
                max=laukiak[index];
            }
        }
        return max;
    }

}