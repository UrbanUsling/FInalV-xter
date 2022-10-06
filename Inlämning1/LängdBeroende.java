package Inlämning1;
abstract class LängdBeroende implements Växt{//abstrakt klass som implementerar växt
    public double setVattenmängd(double längd, double k, double m){
        return längd * k + m;
    }
    /*vissa växters vattenmängd är beroende av längden. Formeln är linjärfunktion (y = kx +m).
    Här definieras metoden för alla subklasser. Subklasserna har sina egna variabler dem skickar in
    som parametrar. m och k kan inte ändras för en växttyp utan är private och initieras utanför konstruktorn.
       */
}
