package publicadministration;

import data.AccredNumb;
import data.Nif;

public class MemberAccreditationDoc extends PDFDcoument{ //Represents the member accreditation document

    private Nif nif;
    private AccredNumb numAffil;

    public MemberAccreditationDoc (Nif nif, AccredNumb nAff){ //Initializes attributes
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

