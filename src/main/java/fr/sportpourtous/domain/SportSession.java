package fr.sportpourtous.domain;


import java.time.LocalDate;

public class SportSession {


    private SportCenter sportsCenter;
    private Coach sportAdvisor;  // Could be null
    private SessionType sessionType;  // Could be COLLECTIVE or INDIVIDUAL

    private Payment payment;
    private SessionDetail sessionDetail;
    private LocalDate dateTime;

}

// getters, setters...
}
