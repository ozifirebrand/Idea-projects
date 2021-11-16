package africa.semicolon.data.repositories;

import africa.semicolon.data.models.User;
import africa.semicolon.utils.dtos.requests.UserInputRequest;

import java.util.List;

public interface UserRepository {
        User save(User user);
        List<User> findAll();
        void deleteById(Integer userId);
        void deleteAll();
        User findUserById(Integer userId);
//        void deleteByRequest(UserInputRequest inputRequest);
}
