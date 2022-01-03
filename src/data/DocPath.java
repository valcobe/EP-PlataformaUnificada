package data;

import data.Exceptions.EmptyCodeException;
import data.Exceptions.NullObjectException;

public class DocPath {

    private final String docPath;

    public DocPath(String code) throws NullObjectException, EmptyCodeException {
        NullObjectException(code);
        EmptyCodeException(code);
        this.docPath = code;
    }

    public String getDocPath(){ return docPath; }

    @Override
    public boolean equals(Object o ){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocPath dp = (DocPath) o;
        return docPath.equals(dp.docPath);
    }

    @Override
    public int hashCode(){ return docPath.hashCode(); }

    @Override
    public String toString(){ return "docPath{" + "ruta='" + docPath + '\'' + '}'; }

    public void NullObjectException(String code) throws NullObjectException{
        if (code == null){
            throw new NullObjectException("Objecte sense instanciar");
        }
    }

    public void EmptyCodeException(String code) throws EmptyCodeException{
        if (code == ""){
            throw new EmptyCodeException("ruta buida");
        }
    }

}
