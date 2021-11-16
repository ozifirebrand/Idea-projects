package africa.semicolon.utils.dtos.responses;

import lombok.Data;

@Data
public class UserResponse {
    private Integer userId;
    private String username;
    private String firstName;
    private String lastName;
}
