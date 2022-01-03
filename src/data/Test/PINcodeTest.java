package data.Test;

import data.Exceptions.NullObjectException;
import data.PINcode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PINcodeTest {

    @Test
    public void NullExceptionTest(){
        NullObjectException thrown = assertThrows(NullObjectException.class,() -> new PINcode(null));
        assertTrue(thrown.getMessage().equals("Objecte sense instanciar"));
    }
}
