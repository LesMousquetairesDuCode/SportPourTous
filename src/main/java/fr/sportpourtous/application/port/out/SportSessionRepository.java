import fr.sportpourtous.domain.Reservation;
import fr.sportpourtous.domain.SportSession;

import java.util.List;

public interface SportSessionRepository {

    Long nextId();

    SportSession findById(SportSessionId sportSessionId);

    List<SportSession> findAll(); // Retrieves all SportSession entities

    void save(SportSession sportSession);

    void remove(SportSessionId sportSessionId); // Removes a SportSession by its SportSessionId

    interface ReservationRepository {

        Reservation findById(Long reservationId); // Retrieves a Reservation by its ID

        List<Reservation> findAll(); // Retrieves all Reservations

        void save(Reservation reservation); // Saves a Reservation

        void deleteById(Long reservationId);  // Deletes a Reservation by its ID
    }
}