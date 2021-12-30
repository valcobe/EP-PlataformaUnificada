package services;

import data.Nif;
import data.PINcode;
import data.Password;
import exceptions.*;

import java.util.Date;

public interface CertificationAuthority { //External service that represents the different trusted certification entities

    boolean sendPIN (Nif nif, Date date) throws NifNotRegisteredException, IncorrectValDateException, AnyMobileRegisteredException, ConnectException;

    boolean checkPIN (Nif nif, PINcode pin) throws NotValidPINException, ConnectException;

    byte checkCredent (Nif nif, Password passw) throws NifNotRegisteredException, NotValidCredException, AnyMobileRegisteredException, ConnectException;

}
