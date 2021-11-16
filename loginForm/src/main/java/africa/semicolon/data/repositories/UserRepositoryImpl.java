package africa.semicolon.data.repositories;

import africa.semicolon.data.models.User;
import africa.semicolon.utils.exceptions.UserDoesNotExistException;

import java.util.*;

public class UserRepositoryImpl implements UserRepository{
    private final Map<Integer, User> database = new HashMap<>();
    private Integer key = 0;
    @Override
    public User save(User user) {
        boolean databaseDoesNotContainKey = !database.containsKey(user.getUserId()) ;
        if ( databaseDoesNotContainKey ) {
            user.setUserId(++key);
        }
        database.put(user.getUserId(), user);

        return user;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(database.values());
    }

    @Override
    public void delete(User user) {
        Integer userId = user.getUserId();
        boolean userDoesNotExist = !database.containsKey(userId);
        if (userDoesNotExist ){
            throw new UserDoesNotExistException("User does not exist");
        }
        database.remove(userId, user);
    }

    @Override
    public void deleteAll() {
        database.clear();
    }

    @Override
    public User findUserById(Integer userId) {
        return database.get(userId);
    }
}
