package africa.semicolon.jijimoji.data.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Lister {
    private String fullName;
    private String phoneNumber;
    private String email;
    private LocalDateTime dateOfRegister = LocalDateTime.now();
    private String location;

}
