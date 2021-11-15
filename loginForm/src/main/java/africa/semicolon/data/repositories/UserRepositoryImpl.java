package africa.semicolon.data.repositories;

import africa.semicolon.data.models.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository{
    private final Map<Integer, User> database = new HashMap<>();
    private Integer key = 0;
    @Override
    public User save(User user) {
        key ++;
        database.put(key, user);
        return user;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public User findUserById() {
        return null;
    }
}
