package fr.sportpourtous.domain;

import java.text.DateFormat;

public class PaymentCard extends Payment {

        // The last four digits of the card number may be stored for reference
        private String cardLastFour;

        // The card brand (e.g., Visa, MasterCard) could be stored if needed
        private String cardBrand;

        // Expiry date could be handy for recurring payments
        private DateFormat cardExpiryDate;

        // Getters, Setters, etc...
    }
}
