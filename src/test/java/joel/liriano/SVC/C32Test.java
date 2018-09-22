package joel.liriano.SVC;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class C32Test {

    private C32 c32 = new C32();

    @Test
    void testMA(){
        assertEquals("mA()",this.c32.mA());
    }
}
