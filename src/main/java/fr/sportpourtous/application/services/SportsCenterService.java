package fr.sportpourtous.application.services;

import fr.sportpourtous.domain.SportsCenter;
import fr.sportpourtous.application.port.out.SportsCenterRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SportsCenterService {

    private final SportsCenterRepository sportsCenterRepository;

    public SportsCenterService(SportsCenterRepository sportsCenterRepository) {
        this.sportsCenterRepository = sportsCenterRepository;
    }

    public SportsCenter createSportsCenter(SportsCenter sportsCenter) {
        return sportsCenterRepository.save(sportsCenter);
    }

    public SportsCenter getSportsCenter(Long id) {
        return sportsCenterRepository.findById(id);
    }

    public List<SportsCenter> getAllSportsCenters() {
        return sportsCenterRepository.findAll();
    }

    public SportsCenter updateSportsCenter(Long id, SportsCenter sportsCenter) {
        SportsCenter existingSportsCenter = getSportsCenter(id);
        // Update the existingSportsCenter with the new properties coming from sportsCenter.
        // Needs method to copy properties between objects.
        return sportsCenterRepository.save(existingSportsCenter);
    }

    public void deleteSportsCenter(Long id) {
        sportsCenterRepository.deleteById(id);
    }
}
