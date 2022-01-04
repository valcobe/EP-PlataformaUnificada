package publicadministration;

import java.util.ArrayList;


public class QuotePeriodsColl {//Represents the total quote periods known as a registered worker
    //Its components, that is, the set of quote periods
    private ArrayList<QuotePeriod> quotePeriodList;

    public QuotePeriodsColl() {
        quotePeriodList = new ArrayList<QuotePeriod>();
    } //Initializes the object

    public ArrayList<QuotePeriod> getQuotePeriodList() {
        return quotePeriodList;
    }

    //the getters

    public void addQuotePeriod (QuotePeriod qPd){
        quotePeriodList.add(qPd);
        this.quotePeriodList = orderQuoteList(quotePeriodList);
    } //Adds a quote period, always respecting the sorting by date, from oldest to later in time

    private ArrayList<QuotePeriod> orderQuoteList(ArrayList<QuotePeriod> quotePeriodList) {
        quotePeriodList.sort((date1,date2) -> date1.getInitDay().compareTo(date2.getInitDay()));
        return quotePeriodList;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < quotePeriodList.size() - 1; i++){
            result += "Data" + quotePeriodList.get(i).getInitDay() + "\n";
        }
        return "QuotePeriodColl{" + result + '\'' + '}';
    } //Converts to String
}

