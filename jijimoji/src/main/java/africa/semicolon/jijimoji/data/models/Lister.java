package africa.semicolon.jijimoji.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class Lister {
    @Id
    private String id;
    private String fullName;
    private String phoneNumber;
    private String email;
    private LocalDateTime dateOfRegister = LocalDateTime.now();
    private String location;

}
