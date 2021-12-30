package services;


import data.Nif;
import exceptions.*;
import publicadministration.LaboralLifeDoc;
import publicadministration.MemberAccreditationDoc;

/**
 * eXTERNAL SERVICES INVOLVED IN PROCEDURES FROM POPULATION
 */

public interface SS { //External service for Social Security Govern administration

    LaboralLifeDoc getLaboralLife (Nif nif) throws NotAffiliatedException, ConnectException;

    MemberAccreditationDoc getMembAccred (Nif nif) throws NotAffiliatedException, ConnectException;
}
