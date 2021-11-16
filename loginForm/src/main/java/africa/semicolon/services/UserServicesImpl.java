package africa.semicolon.services;

import africa.semicolon.data.models.User;
import africa.semicolon.data.repositories.UserRepository;
import africa.semicolon.data.repositories.UserRepositoryImpl;
import africa.semicolon.utils.Mapper.ModelMapper;
import africa.semicolon.utils.dtos.requests.UserInputRequest;
import africa.semicolon.utils.dtos.requests.UserRequest;
import africa.semicolon.utils.dtos.responses.UserResponse;

import java.util.List;

public class UserServicesImpl implements UserServices{
    private final UserRepository repository = new UserRepositoryImpl();

    @Override
    public UserResponse createUser(UserRequest request) {
        User user = ModelMapper.map(request);
        User savedUser = repository.save(user);

        return ModelMapper.map(savedUser);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findUserById(Integer userId) {
        return repository.findUserById(userId);
    }

    @Override
    public void deleteUserById(Integer userId) {
        repository.deleteById(userId);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public void deleteUser(User user) {
        repository.deleteById(user.getUserId());
    }

//    @Override
//    public void deleteUser(UserInputRequest inputRequest) {
//        repository.deleteByRequest(inputRequest);
//    }
}
