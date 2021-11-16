package africa.semicolon.services;

import africa.semicolon.data.models.User;
import africa.semicolon.utils.dtos.requests.UserInputRequest;
import africa.semicolon.utils.dtos.requests.UserRequest;
import africa.semicolon.utils.dtos.responses.UserResponse;

import java.util.List;

public interface UserServices {
    UserResponse createUser (UserRequest request);
    User findUserById(Integer userId);
    List<User> findAll();
    void deleteUserById(Integer userId);
    void deleteAll();
    void deleteUser(User user);
//    void deleteUser(UserInputRequest inputRequest);
}
