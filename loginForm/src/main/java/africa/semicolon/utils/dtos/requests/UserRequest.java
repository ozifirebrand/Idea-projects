package africa.semicolon.utils.dtos.requests;

import lombok.Data;

@Data
public class UserRequest {
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
}
