package Inlämning1;
import javax.swing.*;
import java.util.*;

public class HuvudprogramVäxt {//huvudklass
    public HuvudprogramVäxt(){//konstruktor
        Map<String, String> plants= new HashMap<>();
        //hashmap skapas. Praktisk lista för att spara namn och dos (string och string) för enkel utskrift
        Växt putte = new Palm("Putte", 1);
        plants.put(putte.getNamn(), putte.getDos());
        Växt igge = new Kaktus("Igge",  0.2);
        plants.put(igge.getNamn(), igge.getDos());
        Växt laura = new Palm("Laura", 5);
        plants.put(laura.getNamn(), laura.getDos());
        Växt meatloaf = new KöttVäxt("Meatloaf", 0.7);
        plants.put(meatloaf.getNamn(), meatloaf.getDos());
        /*
        Objekt skapas av de fyra plantorna. Fler kan läggas till. De appliceras i hashmap också.
        Alla objekten ÄR växter OCH en av subklasserna. Kallas Casting. Växt bestämmer vilka metoder vi kan anropa.
        Sublklassen ger oss metodkroppen och konstruktor. Vi kunde antingen göra Palm p = new Palm()
        , eller ge Växt fler av metoderna som konstruerats i subklasserna för att få åtkomst till fler
        "getters" (getLängd t ex), men allt vi är ute efter är getNamn och getDos och superklassen har dem abstrakt.
        Detta är bra exempel på polymorfism: 3 växter med 3 olika konstruktorer och metoder som körs vid anrop.
         */
        String namn = (JOptionPane.showInputDialog(null,"Vilken växt ska vattnas?",
                "Val av planta", JOptionPane.QUESTION_MESSAGE));
        //dialogruta som sparar växtnamnet man vill ha i string namn
        if(namn == null)
            System.exit(0);//Om inget skrivs in så avslutas programmet
        String dos = plants.get(namn.toLowerCase());
        //Ny variabel dos kontrollerar ifall det finns en planta i hashmap som stämmer överens med inputet (lowercase)
        if(dos == null){
            JOptionPane.showMessageDialog(null, "Denna växt är tyvärr ej här", "Inget vatten",
                    JOptionPane.PLAIN_MESSAGE, new ImageIcon("src\\Inlämning1\\bilder\\plantor.jpg"));
            //Om man får null betyder det att inget index i hashmap stämde överens. Den plantan finns inte. Rutan informerar
        }
        else {
            JOptionPane.showMessageDialog(null, namn + " ska ha " + dos, "Bevattning",
                    JOptionPane.PLAIN_MESSAGE, new ImageIcon("src\\Inlämning1\\bilder\\" + namn + ".png"));
        }//Om den plantan finns på hotellet får man meddelande om vattenmängden och vattentypen den ska ha
    }
    public static void main(String[] args){//main
        HuvudprogramVäxt ph = new HuvudprogramVäxt();//ny instance av huvudkonstruktorn körs

    }
}
