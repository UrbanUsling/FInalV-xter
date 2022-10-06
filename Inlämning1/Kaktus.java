package Inlämning1;

public class Kaktus extends LängdOberoende{
    /*Implementerar Längdoberoende och är växt samtidigt. HÄR kapslas allt relevant in för denna specifika
    växttyp. Variablerna kan bara definieras här.  Definitionen static ska användas sparsamt.
    Den ärver metoder som en växt behöver, dock definieras kroppen här inne för denna typ.
    Den kommunicerar med VattenTyper för att få rätt enum av vätska
     */
    private String namn;
    private double längd;
    private double vattenmängd;
    private static double m = 0.02;
    private static String typ = VattenTyper.MNR.getString();//Här deklareras vattentypen som växten ska ha
    /*Inkapsling. 5 skyddade variabler. 3 första är instansvariabler och unika för varje objekt i klassen.
     2 sista initieras och ändrar inte värde.
     De 2 är dock gemensamma för alla objekt i klassen (klassvariabler) så kan göras static;*/
    public Kaktus(String namn, double längd){//2 av variablerna initieras vid konstruktoranrop som parametrar
        this.namn=namn;
        this.längd = längd;
        vattenmängd = setVattenmängd(m);//metodanrop i superklassen som ger objektet rätt vattenmängd
    }

    @Override//är denna metod som körs vid anrop och inte en i superklass
    public String getDos() {//String som skriver ut beräknad vattenmängd av rätt vattentyp. Anrop av emun
        return vattenmängd + " liter "+ typ;
    }

    @Override
    public String getNamn() {return this.namn.toLowerCase();}
    //Metod med kropp för att få ut namnet på objekt i små bokstäver för jämförelser
    public double getLängd(){return längd;}
    public double getVattenmängd(){return vattenmängd;}
    /*Dessa två metoder finns för testkörning. Dock är dem public så att andra klasser kan få ut
    objektets vattenmängd och längd. De returnerar endast värden, så ingen risk att något ändras */

}
