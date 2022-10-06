import Inlämning1.KöttVäxt;
import org.junit.jupiter.api.Test;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;
class KöttVäxtTest {
    KöttVäxt k = new KöttVäxt("Philip", 10);
    /*
    Testar metoderna för namn, längd och vattenmängd. Resterande metoder bygger på dessa.
     */
    @Test
    void getNamn() {
        assert(Objects.equals(k.getNamn(), "philip"));
        assert(!Objects.equals(k.getNamn(), "Philip"));
    }
    @Test
    void getVattenmängd(){
        assert (k.getVattenmängd() == 2.1);
        assert (k.getVattenmängd() != 43);

    }
    @Test
    void getLängd() {
        assert (k.getLängd() == 10);
        assert (k.getLängd()!= 4);
    }
}