package publicadministration;


import data.Nif;

import java.util.Date;

public class LaboralLifeDoc extends PDFDcoument{ //Represents the laboral life
    private Nif nif;
    private QuotePeriodsColl quotePds;

    public LaboralLifeDoc (Nif nif, QuotePeriodsColl qtP){
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

