package Inlämning1;

public enum VattenTyper {//ett enum av de 3 oföränderliga och begränsade vätsketyperna
    KRN("kranvatten"), MNR("mineralvatten"), PRT("proteindryck");
    //CAPS enligt konvention, men en finare string implementeras
    private final String aString;//final

    VattenTyper(String s) {
        this.aString = s;
    }

    String getString() {
        return aString;
    }
    //den finare texten returneras för motsvarande anrop genom getString anrop
}