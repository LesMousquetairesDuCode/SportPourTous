package fr.sportpourtous.application.port.out;


import fr.sportpourtous.domain.User;
import fr.sportpourtous.domain.UserId;

public interface UserRepository {

    UserId nextId();

    User findById(UserId userId);

    void save(User user);
}
