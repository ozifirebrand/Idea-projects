package africa.semicolon.services;

import africa.semicolon.data.models.User;
import africa.semicolon.utils.dtos.UserRequest;
import africa.semicolon.utils.dtos.UserResponse;

import java.util.List;

public interface UserServices {
    UserResponse createUser (UserRequest request);
    User findUserById(Integer userId);
    List<User> findAll();
    void deleteUser(Integer userId);
    void deleteAll();
}
