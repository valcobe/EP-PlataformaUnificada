package data.Test;

import data.Exceptions.BadlyFormedCodeException;
import data.Exceptions.EmptyCodeException;
import data.Exceptions.NullObjectException;
import data.Nif;
import data.Test.TestInterfaces.DataExceptionsInterfaceTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NifTest implements DataExceptionsInterfaceTest {
    Nif nif;
    Nif nif1;
    Nif nif2;

    @BeforeEach
    void initNifTest() throws NullObjectException, EmptyCodeException, BadlyFormedCodeException{
        nif1 = new Nif("492571195G");
        nif2 = new Nif("492571195M");
    }

    @Override
    @Test
    public void NullObjectExceptionTest(){
        NullObjectException thrown = assertThrows(NullObjectException.class,() -> nif = new Nif(null));
        assertTrue(thrown.getMessage().equals("Objecte sense instanciar"));

    }

    @Override
    @Test
    public void EmptyCodeExceptionTest(){
        EmptyCodeException thrown = assertThrows(EmptyCodeException.class,() -> nif = new Nif(""));
        assertTrue(thrown.getMessage().equals("Nif buit"));
    }

    @Test
    public void BadlyFormedCodeExceptionTest(){
        BadlyFormedCodeException thrown = assertThrows(BadlyFormedCodeException.class,() -> nif = new Nif(","));
        assertTrue(thrown.getMessage().equals("Nif erroni"));

    }

    @Test
    public void BadlyFormedCodeExceptionTest2(){
        BadlyFormedCodeException thrown = assertThrows(BadlyFormedCodeException.class,() -> nif = new Nif("."));
        assertTrue(thrown.getMessage().equals("Nif erroni"));
    }

    @Test
    public void BadlyFormedExceptionTest3(){
        BadlyFormedCodeException thrown = assertThrows(BadlyFormedCodeException.class,() ->nif = new Nif("%"));
        assertTrue(thrown.getMessage().equals("Nif erroni"));
    }


}
