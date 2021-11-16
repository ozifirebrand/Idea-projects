package africa.semicolon.services;

import africa.semicolon.data.models.User;
import africa.semicolon.utils.dtos.UserRequest;
import africa.semicolon.utils.dtos.UserResponse;

public interface UserServices {
    UserResponse createUser (UserRequest request);
    User findUser(Integer userId);
    void deleteUser(Integer userId);
    void deleteAll();
}
