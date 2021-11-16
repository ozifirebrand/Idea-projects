package africa.semicolon.services;

import africa.semicolon.data.models.User;
import africa.semicolon.data.repositories.UserRepository;
import africa.semicolon.data.repositories.UserRepositoryImpl;
import africa.semicolon.utils.Mapper.ModelMapper;
import africa.semicolon.utils.dtos.UserRequest;
import africa.semicolon.utils.dtos.UserResponse;

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
    public void deleteUser(Integer userId) {
        User user = repository.findUserById(userId);
        repository.delete(user);
    }

    @Override
    public void deleteAll() {

    }
}
