package joel.liriano.SVC;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class C22Test {

    private C22 c22 = new C22();

    @Test
    void testMA(){
        assertEquals("mA()",this.c22.mA());
    }
}
