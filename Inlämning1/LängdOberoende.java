package Inlämning1;

abstract class LängdOberoende implements Växt{//abstrakt klass som implementerar växt
    public double setVattenmängd(double m){
        return m;
    }
    /*vissa växters vattenmängd är oberoende av längden. Därför blir formeln y= m.
    Här definieras metoden för alla subklasser. Subklasserna har sin egen m variabel dem skickar in
    som parameter. m är mer som konstant för varje klass då den är final och initiers utanför konstruktor.
       */
}