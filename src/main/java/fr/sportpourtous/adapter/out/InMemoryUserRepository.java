package fr.sportpourtous.adapter.out;

package fr.gboissinot.al.account.step5.adapter.out;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class InMemoryUserRepository implements UserRepository {

    private final Map<UserId, User> registry = new HashMap<>();

    @Override
    public UserId nextId() {
        return UserId.of(UUID.randomUUID());
    }

    @Override
    public User findById(UserId accountId) {
        return registry.computeIfAbsent(accountId,
                key -> {
                  //  throw AccountException.notFoundAccountId(accountId);
                });
    }

    @Override
    public void save(User user) {
        registry.put(user.id(), user);
    }
}
