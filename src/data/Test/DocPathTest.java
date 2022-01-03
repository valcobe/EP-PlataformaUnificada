package data.Test;

import data.DocPath;
import data.Exceptions.EmptyCodeException;
import data.Exceptions.NullObjectException;
import data.Test.TestInterfaces.DataExceptionsInterfaceTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DocPathTest implements DataExceptionsInterfaceTest {
    DocPath dp;
    DocPath dp1;
    DocPath dp2;

    @BeforeEach
    void initDocPathTest() throws NullObjectException, EmptyCodeException{
        dp1 = new DocPath("SS/Ciudadanos");
        dp2 = new DocPath("SS/Ciudadanos/Informes");

    }

    @Override
    @Test
    public void NullObjectExceptionTest(){
        NullObjectException thrown = assertThrows(NullObjectException.class,() -> dp = new DocPath(null));
        assertTrue(thrown.getMessage().equals("Objecte sense instanciar"));
    }

    @Override
    @Test
    public void EmptyCodeExceptionTest(){
        EmptyCodeException thrown = assertThrows(EmptyCodeException.class,() -> dp = new DocPath(""));
        assertTrue(thrown.getMessage().equals("Ruta buida"));
    }

}
