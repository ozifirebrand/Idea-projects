package africa.semicolon.data.repositories;

import africa.semicolon.data.models.User;
import africa.semicolon.utils.dtos.requests.UserInputRequest;
import africa.semicolon.utils.exceptions.UserDoesNotExistException;

import java.util.*;

public class UserRepositoryImpl implements UserRepository{
    private final Map<Integer, User> database = new HashMap<>();
    private Integer key = 0;
    @Override
    public User save(User user) {
        int id = user.getUserId();
        boolean databaseDoesNotContainId = !database.containsKey(id) ;
        if ( databaseDoesNotContainId ) {
            key +=1;
            user.setUserId(key);
        }
        database.put(user.getUserId(), user);
        return user;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(database.values());
    }

    @Override
    public void deleteById(Integer userId) {
        validateId(userId);
        User user = database.get(userId);
        database.remove(userId, user);
    }

    private void validateId(Integer userId) {
        boolean userDoesNotExist = !database.containsKey(userId);
        if (userDoesNotExist ){
            throw new UserDoesNotExistException("User does not exist");
        }
    }

    @Override
    public void deleteAll() {
        database.clear();
    }

    @Override
    public User findUserById(Integer userId) {
        return database.get(userId);
    }

//    @Override
//    public void deleteByRequest(UserInputRequest inputRequest) {
//        String password = inputRequest.getPassword();
//        String phoneNumber = inputRequest.getPhoneNumber();
//        Set<Integer> userKey = database.keySet();
//
//        for (User user : database)
//    }
}
