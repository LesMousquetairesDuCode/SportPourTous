package fr.sportpourtous.domain;


public class PaymentWithdrawal extends Payment {

    private String name;
    private String address;
    private String iban;
    private String bic;
    private String creditorName;
    private String creditorAddress;
    private String creditorIdentifier; // ICS
    private boolean recurring;
    private LocalDate mandateSignatureDate;
    private String mandateReferenceNumber; // RUM

    // Constructors, Getters, and Setters...
}