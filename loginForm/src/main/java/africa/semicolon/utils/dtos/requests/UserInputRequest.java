package africa.semicolon.utils.dtos.requests;

import lombok.Data;

@Data
public class UserInputRequest {
    private String phoneNumber;
    private String password;
}