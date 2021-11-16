package africa.semicolon.utils.Mapper;

import africa.semicolon.data.models.User;
import africa.semicolon.utils.dtos.UserRequest;
import africa.semicolon.utils.dtos.UserResponse;

public class ModelMapper {

    public static User map(UserRequest request){
        User user = new User();
        user.setPassword(request.getPassword());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setLastName(request.getLastName());
        user.setFirstName(request.getFirstName());
        user.setUsername(request.getUsername());
        user.setUserId(request.getUserId());
        return user;
    }

    public static UserResponse map(User user){
        UserResponse response = new UserResponse();
        response.setFirstName(user.getFirstName());
        response.setUsername(user.getUsername());
        response.setLastName(user.getLastName());
        response.setUserId(user.getUserId());
        return response;
    }
}
