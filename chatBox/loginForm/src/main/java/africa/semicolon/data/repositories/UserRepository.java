package africa.semicolon.data.repositories;

import africa.semicolon.data.models.User;

import java.util.List;

public interface UserRepository {
    User createUser(User user);
    List<User> findAll();
    void delete (User user);
    void deleteAll();
    User findUserById();

}
