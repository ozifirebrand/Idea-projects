package africa.semicolon.data.models;

import lombok.Data;

@Data
public class User {
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
}
