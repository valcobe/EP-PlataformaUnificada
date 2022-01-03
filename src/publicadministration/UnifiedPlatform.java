package publicadministration;

import data.DocPath;
import data.Nif;
import data.PINcode;
import data.Password;
import exceptions.*;

import java.util.Date;


public class UnifiedPlatform {
    //The class members

    //Input events

    public void processSearcher(){

    }

    public void enterKeyWords (String keyWord) throws AnyKeyWordProcedureException {

    }

    public void selectSS() {

    }

    public void selectCitizens(){

    }

    public void selectReports(){

    }

    public void selectCertificationReport (byte opc) {

    }

    public void selectAuthMethod (byte opc){

    }

    public void enterNIFPINobt (Nif nif, Date valDate) throws NifNotRegisteredException, IncorrectValDateException, AnyMobileRegisteredException, ConnectException {

    }

    public void enterPIN (PINcode pin) throws NotValidPINException, NotAffiliatedException, ConnectException {

    }

    public void enterCred (Nif nif, Password passw)throws NifNotRegisteredException, NotValidCredException, AnyMobileRegisteredException, ConnectException{

    }

    private void printDocument()throws BadPathException, PrintingException{

    }

    private void downloadDocument(){ }

    private void selectPath (DocPath path)throws BadPathException {

    }//No se pide implementacion

    //Other operations

    private String searchKeyWords (String keyWord)throws AnyKeyWordProcedureException{

    }

    private void OpenDocument (DocPath path)throws BadPathException {

    }

    private void printDocument (DocPath path)throws BadPathException, PrintingException{

    } //No se pide implementacion

    private void downloadDocument(DocPath path)throws BadPathException{

    }  //No se pide implementacion

    //Possibly more operations

}
