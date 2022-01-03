package data.Test;

import data.Exceptions.EmptyCodeException;
import data.Exceptions.NullObjectException;
import data.Password;
import data.Test.TestInterfaces.DataExceptionsInterfaceTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordTest implements DataExceptionsInterfaceTest {

    Password passwd;
    Password passwd1;
    Password passwd2;

    @BeforeEach
    void initPasswordTest() throws NullObjectException, EmptyCodeException{
        passwd1 = new Password("array00");
        passwd2 = new Password("87654321");
    }

    @Override
    @Test
    public void NullObjectExceptionTest(){
        NullObjectException thrown = assertThrows(NullObjectException.class,() -> passwd = new Password(null));
        assertTrue(thrown.getMessage().equals("Objecte sense instanciar"));
    }

    @Override
    @Test
    public void EmptyCodeExceptionTest(){
        EmptyCodeException thrown = assertThrows(EmptyCodeException.class,() -> passwd = new Password(""));
        assertTrue(thrown.getMessage().equals("Contrasenya buida"));
    }
}
