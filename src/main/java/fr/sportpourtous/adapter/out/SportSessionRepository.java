package fr.sportpourtous.adapter.out;

import fr.sportpourtous.domain.SportSession;
import java.util.List;
import java.util.ArrayList; // For the in-memory storage example

public class SportSessionRepository implements SportSessionRepository {

    private List<SportSession> sportSessions = new ArrayList<>();

    @Override
    public SportSession save(SportSession sportSession) {
        sportSessions.add(sportSession);
        return sportSession;
    }

    @Override
    public SportSession findById(Long id) {
        return sportSessions.stream()
                .filter(sportSession -> sportSession.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<SportSession> findAll() {
        return sportSessions;
    }

    @Override
    public void delete(Long id) {
        sportSessions.removeIf(sportSession -> sportSession.getId().equals(id));
    }
}