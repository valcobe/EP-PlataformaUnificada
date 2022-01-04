package publicadministration;

import data.DocPath;
import data.Nif;
import data.PINcode;
import data.Password;
import exceptions.*;
import services.CertificationAuthority;
import services.SS;

import java.util.Date;
import java.util.HashMap;


public class UnifiedPlatform {
    private boolean inSearchProcess;
    private boolean SSIsSelected;
    private boolean citizensIsSelected;
    private boolean reportsSelected;
    private String searchedAAPP;
    private Byte certificationReport;
    private Byte authMethod;
    private SS ss;
    private CertificationAuthority certificationAuthority;
    private Nif nifToWaitPIN;
    private HashMap<String,String> procedures;
    private LaboralLifeDoc laboralLifeDoc;
    private MemberAccreditationDoc memberAccreditationDoc;

    public UnifiedPlatform(){
        inSearchProcess = false;
        SSIsSelected = false;
        citizensIsSelected = false;
        reportsSelected = false;
        searchedAAPP = null;
        certificationReport = null;
        authMethod = null;
    }

    public void processSearcher(){
        inSearchProcess = true;
    }

    public void enterKeyWords (String keyWord) throws AnyKeyWordProcedureException, NotInProcedureSearcherException {
        if(!inSearchProcess){
            throw new NotInProcedureSearcherException("No està al buscador de tràmits");
        }
        if(!procedures.containsKey(keyWord)){
            throw new AnyKeyWordProcedureException("Paraula no identificada");
        }
        searchedAAPP = searchKeyWords(keyWord);
    }

    public void selectSS() {
        SSIsSelected = true;

    }

    public void selectCitizens() throws BadPathException {
        if(!SSIsSelected && searchedAAPP != "SS"){
            throw new BadPathException("No està al path correcte");
        }
        citizensIsSelected = true;
    }

    public void selectReports() throws BadPathException {
        if(!citizensIsSelected){
            throw new BadPathException("No està al path correcte");
        }
        reportsSelected = true;
    }

    public void selectCertificationReport (byte opc) throws BadPathException{
        if(!reportsSelected){
            throw new BadPathException("No està al path correcte");
        }
        reportsSelected = true;
    }

    public void selectAuthMethod (byte opc) throws BadPathException{
        if(certificationReport == null){
            throw new BadPathException("No està al path correcte");
        }
        certificationReport = opc;
    }

    public void enterNIF_PINobt (Nif nif, Date valDate) throws NifNotRegisteredException, IncorrectValDateException, AnyMobileRegisteredException, ConnectException, BadPathException {
        if(authMethod != 1){
            throw new BadPathException("No està al path correcte");
        }
        if(valDate == null){
            throw new IncorrectValDateException("Data incorrecta");
        }
        if(nif == null){
            throw new NifNotRegisteredException("Nif no registrat");
        }
        if(certificationAuthority.sendPIN(nif,valDate)){
            nifToWaitPIN = nif;
        }
    }

    public void enterPIN (PINcode pin) throws NotValidPINException, NotAffiliatedException, ConnectException {
        if (pin == null){
            throw new NotValidPINException("PIN no vàlid");
        }
        if (ss == null) {
            throw new NotAffiliatedException("No està a la SS");
        }
        certificationAuthority.checkPIN(nifToWaitPIN,pin);
        if(certificationReport == 1){
            laboralLifeDoc = ss.getLaboralLife(nifToWaitPIN);
        } else {
            memberAccreditationDoc = ss.getMembAccred(nifToWaitPIN);
        }
    }

    private void printDocument()throws BadPathException, PrintingException{
    }//No se pide implementación
    private void downloadDocument(){ }//No se pide implementación
    private void selectPath (DocPath path)throws BadPathException {
    }//No se pide implementacion

    //Other operations

    private String searchKeyWords (String keyWord)throws AnyKeyWordProcedureException{
        if(!procedures.containsKey(keyWord)){
            throw new AnyKeyWordProcedureException("Paraula no identificada");
        }
        return procedures.get(keyWord);
    }

    public void setCertificationAuthority(CertificationAuthority certificationAuthority){
        this.certificationAuthority = certificationAuthority;
    }

    public void setSs(SS ss){
        this.ss = ss;
    }
}

