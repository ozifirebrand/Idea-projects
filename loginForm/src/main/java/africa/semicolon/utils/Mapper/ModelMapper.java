package africa.semicolon.utils.Mapper;

import africa.semicolon.data.models.User;
import africa.semicolon.utils.dtos.UserRequest;

public class ModelMapper {
    private final int key = 0;

    public static User map(UserRequest request){
        User user = new User();
        user.setPassword(request.getPassword());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setLastName(request.getLastName());
        user.setFirstName(request.getFirstName());
        user.setUsername(request.getUsername());
        return user;
    }
}
