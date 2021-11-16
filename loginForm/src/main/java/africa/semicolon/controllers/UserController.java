package africa.semicolon.controllers;


import africa.semicolon.data.models.User;
import africa.semicolon.services.UserServices;
import africa.semicolon.services.UserServicesImpl;
import africa.semicolon.utils.dtos.requests.UserInputRequest;
import africa.semicolon.utils.dtos.requests.UserRequest;
import africa.semicolon.utils.dtos.responses.UserResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserServices services = new UserServicesImpl();

    @PostMapping ("/api/createuser")
    public UserResponse register(@RequestBody UserRequest request){
        return services.createUser(request);
    }

    @GetMapping("/api/getpackage/{id}")
    public User findUserById(@PathVariable ("id") Integer trackingId){
        return services.findUserById(trackingId);
    }

//    @GetMapping("/api/deleteuser")
//    public void delete(@RequestBody User user){
//    }
    // public UserInputResponse login(@RequestBody UserInputRequest request) { return services.findUserById(request.getUserId()); }
}
