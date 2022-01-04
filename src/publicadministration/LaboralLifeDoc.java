package publicadministration;


import data.DocPath;
import data.Nif;

import java.io.File;
import java.util.Date;

public class LaboralLifeDoc extends PDFDcoument{ //Represents the laboral life
    private Nif nif;
    private QuotePeriodsColl quotePds;

    public LaboralLifeDoc (Date createDate, DocPath path, File file, Nif nif, QuotePeriodsColl qtP){
        super(createDate,path,file);
        this.nif = nif;
        this.quotePds = qtP;

    }

    public Nif getNif() {
        return nif;
    }


    public QuotePeriodsColl getQuotePds() {
        return quotePds;
    }
}

