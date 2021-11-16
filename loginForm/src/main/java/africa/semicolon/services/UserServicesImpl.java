package africa.semicolon.services;

import africa.semicolon.data.models.User;
import africa.semicolon.utils.dtos.UserRequest;
import africa.semicolon.utils.dtos.UserResponse;

public class UserServicesImpl implements UserServices{

    @Override
    public UserResponse createUser(UserRequest request) {
        return null;
    }

    @Override
    public User findUser(Integer userId) {
        return null;
    }

    @Override
    public void deleteUser(Integer userId) {

    }

    @Override
    public void deleteAll() {

    }
}
