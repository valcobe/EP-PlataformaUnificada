package data;

import data.Exceptions.BadlyFormedCodeException;
import data.Exceptions.EmptyCodeException;
import data.Exceptions.NullObjectException;

final public class Nif {

    //The tax identification number in the Spanish state.

    private final String nif;

    public Nif(String code) throws NullObjectException, BadlyFormedCodeException, EmptyCodeException {
        NullObjectException(code);
        EmptyCodeException(code);
        this.nif = code;
        BadlyFormedCodeException(code);
    }

    public String getNif() {
        return nif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nif niff = (Nif) o;
        return nif.equals(niff.nif);
    }

    @Override
    public int hashCode() {
        return nif.hashCode();
    }

    @Override
    public String toString() {
        return "Nif{" + "nif ciudadano='" + nif + '\'' + '}';
    }


    public void NullObjectException(String code) throws NullObjectException {
        if (code == null) {
            throw new NullObjectException("Objecte sense instanciar");
        }
    }

    public void EmptyCodeException(String code) throws EmptyCodeException {
        if (code == "") {
            throw new EmptyCodeException("Codi d'identificació buit");
        }
    }

    public void BadlyFormedCodeException(String code) throws BadlyFormedCodeException {
        for (int i = 0; i < code.length(); i++) {
            if (!Character.isDigit(code.charAt(i)) && !Character.isLetter(code.charAt(i))) {
                throw new BadlyFormedCodeException("NIF erroni");
            }
        }
    }
}



