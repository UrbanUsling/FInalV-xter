package Inlämning1;


interface Växt {/*görs till inferface. För vagt för att vara ett objekt. Finns för mycket växttyper
            Ett interface är public då det är meningen att andra klasser ska ärva och definiera metoder
*/
    String getDos();//alla växter behöver dos av rätt vatten. Specifik typ får definieras i metoden
    String getNamn();//alla växter i hotellet behöver namn. Variabeln definieras i varje växtklass för private
}