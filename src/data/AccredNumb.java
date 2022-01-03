package data;

import data.Exceptions.NullObjectException;

public class AccredNumb {

    private final String accredNumb;

    public AccredNumb(String code) throws NullObjectException{
        NullObjectException(code);
        this.accredNumb = code;
    }

    public String getAccredNumb(){ return accredNumb; }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccredNumb acNumb = (AccredNumb) o;
        return accredNumb.equals(acNumb.accredNumb);
    }

    @Override
    public int hashCode(){ return accredNumb.hashCode(); }

    @Override
    public String toString(){ return "accredNumb{" + "Número de afiliació='" + accredNumb + '\'' + '}'; }

    public void NullObjectException(String code) throws NullObjectException{
        if (code == null){
            throw new NullObjectException("Objecte sense instanciar");
        }
    }
}
