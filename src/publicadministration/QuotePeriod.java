package publicadministration;

import java.util.Date;

public class QuotePeriod { //Represents a quote period as a registered worker

    private Date initDay;
    private int numDays;

    public QuotePeriod (Date date, int ndays){
        this.initDay = date;
        this.numDays = ndays;
    } //Initializes attributes

    public Date getInitDay(){
        return initDay;
    }

    public int getNumDays(){
        return numDays;
    }
    public String toString(){
        return "<" + initDay + "-" + numDays + ">";
    } //converts to String

    public boolean compareTo(Date date2){
        return (this.initDay.after(date2));
    }
}
