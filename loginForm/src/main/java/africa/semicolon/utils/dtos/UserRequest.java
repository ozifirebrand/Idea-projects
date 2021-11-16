package africa.semicolon.utils.dtos;

import lombok.Data;

@Data
public class UserRequest {
    private Integer userId;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
}
