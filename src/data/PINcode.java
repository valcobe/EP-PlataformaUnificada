package data;

import data.Exceptions.NullObjectException;

public class PINcode {

    private final String PINcode;

    public PINcode(String code) throws NullObjectException{
        NullObjectException(code);
        this.PINcode = code;

    }

    public String getPINcode(){ return PINcode;}

    @Override
    public boolean equals (Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PINcode pin = (PINcode) o;
        return PINcode.equals(pin.PINcode);
    }

    @Override
    public int hashCode(){ return PINcode.hashCode();}

    @Override
    public String toString(){ return "PINcode{"+ "código pin='" + PINcode + '\'' + '}';}

    public void NullObjectException(String code) throws NullObjectException{
        if (code == null){
            throw new NullObjectException("Objecte sense instanciar");
        }
    }

}
