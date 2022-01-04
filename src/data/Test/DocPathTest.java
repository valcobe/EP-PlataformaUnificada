package data.Test;

import data.DocPath;
import data.Exceptions.EmptyCodeException;
import data.Exceptions.NullObjectException;
import data.Test.TestInterfaces.DataExceptionsInterfaceTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DocPathTest {
    DocPath dp;
    DocPath dp1;
    DocPath dp2;


    @Test
    public void NullObjectExceptionTest(){
        NullObjectException thrown = assertThrows(NullObjectException.class,() -> dp = new DocPath(null));
        assertTrue(thrown.getMessage().equals("Objecte sense instanciar"));
    }


}
