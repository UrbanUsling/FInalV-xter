import Inlämning1.Kaktus;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {
    Kaktus k = new Kaktus("Romario", 7.4);
/*
Testar metoderna för namn, längd och vattenmängd. Resterande metoder bygger på dessa.
 */

    @Test
    void getNamn() {
        assert (Objects.equals(k.getNamn(), "romario"));
        assert (!Objects.equals(k.getNamn(), "romARio"));
    }

    @Test
    void getLängd() {
        assert (k.getLängd() == 7.4);
        assert (k.getLängd() != 3);
    }


    @Test
    void getVattenmängd() {
        assert (k.getVattenmängd() == 0.02);
        assert (k.getVattenmängd()!= 0.33);
    }
}