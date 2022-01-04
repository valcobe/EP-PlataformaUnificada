package publicadministration;

import data.AccredNumb;
import data.DocPath;
import data.Nif;

import java.io.File;
import java.util.Date;

public class MemberAccreditationDoc extends PDFDcoument{ //Represents the member accreditation document

    private Nif nif;
    private AccredNumb numAffil;

    public MemberAccreditationDoc (Date createDate, DocPath path, File file, Nif nif, AccredNumb nAff){
        super(createDate,path,file);//Initializes attributes
        this.nif = nif;
        this.numAffil = nAff;
    }

    public Nif getNif() {
        return nif;
    }

    public AccredNumb getNumAffil() {
        return numAffil;
    }
}

