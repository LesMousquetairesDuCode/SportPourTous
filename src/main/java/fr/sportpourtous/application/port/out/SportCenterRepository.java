package fr.sportpourtous.application.port.out;

import fr.sportpourtous.domain.SportsCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SportsCenterRepository {

    List<SportsCenter> findByName(String name);

    List<SportsCenter> findBySport(String sport);

    void deleteByName(String name);

    boolean existsByName(String name);
}
