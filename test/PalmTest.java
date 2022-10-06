import Inlämning1.Palm;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {
    Palm p = new Palm("Baggio", 2);
/*
Testar metoderna för namn, längd och vattenmängd. Resterande metoder bygger på dessa.
 */

    @Test
    void getNamn() {
        assert (Objects.equals(p.getNamn(), "baggio"));
        assert (!Objects.equals(p.getNamn(), "kgijg"));
    }
    @Test
    void getVattenmängd() {
        assert (p.getVattenmängd() == 1);
        assert (p.getVattenmängd() != 43);
    }
    @Test
    void getLängd() {
        assert (p.getLängd() == 2);
        assert (p.getLängd()!= 5);
    }
}