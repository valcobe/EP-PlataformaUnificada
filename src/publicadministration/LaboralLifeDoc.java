package publicadministration;


import data.Nif;

public class LaboralLifeDoc extends PDFDcoument{ //Represents the laboral life
    private Nif nif;
    private QuotePeriodsColl quotePds;

    public LaboralLifeDoc (Nif nif, QuotePeriodsColl qtP){ //Initializes attributes
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

