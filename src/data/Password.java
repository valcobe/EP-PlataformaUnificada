package data;

import data.Exceptions.EmptyCodeException;
import data.Exceptions.NullObjectException;

public class Password {

    private final String passwd;

    public Password(String code) throws NullObjectException, EmptyCodeException{
        NullObjectException(code);
        EmptyCodeException(code);
        this.passwd = code;

    }

    public String getPasswd(){ return passwd; }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password pwd = (Password) o;
        return passwd.equals(pwd.passwd);
    }

    @Override
    public int hashCode(){ return passwd.hashCode(); }

    @Override
    public String toString(){ return "passwd{" + "Contrasenya='" + passwd + '\'' + '}';}

    public void NullObjectException(String code) throws NullObjectException{
        if (code == null){
            throw new NullObjectException("Objecte sense instanciar");
        }
    }

    public void EmptyCodeException(String code) throws EmptyCodeException{
        if (code == ""){
            throw new EmptyCodeException("Contrasenya buida");
        }
    }

}
