import fr.sportpourtous.domain.User;
import fr.sportpourtous.domain.UserId;

import java.util.List;

public interface UserRepository {

    UserId nextId();

    User findById(UserId userId);

    List<User> findAll(); // Retrieves all users

    void save(User user);

    void remove(UserId userId); // Removes a user by their userId
}