package africa.semicolon.jijimoji.dtos.responses;

import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Data
public class RegisterListerResponse {
    private String id;
    private String dateAndTimeCreated;

}
