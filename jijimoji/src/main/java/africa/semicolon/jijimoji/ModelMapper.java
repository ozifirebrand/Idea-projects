package africa.semicolon.jijimoji;

import africa.semicolon.jijimoji.data.models.Lister;
import africa.semicolon.jijimoji.dtos.requests.RegisterListerRequest;
import africa.semicolon.jijimoji.dtos.responses.RegisterListerResponse;

import java.time.format.DateTimeFormatter;

public class ModelMapper {
    public static Lister map(RegisterListerRequest request) {
        Lister lister = new Lister();
        lister.setPhoneNumber(request.getPhoneNumber());
        lister.setLocation(request.getLocation());
        lister.setEmail(request.getEmail());
        lister.setFullName(request.getFullName());
        return lister;
    }

    public static RegisterListerResponse map(Lister lister) {
        RegisterListerResponse response = new RegisterListerResponse();
        response.setId(lister.getId());
        response.setDateAndTimeCreated(DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm a").format(lister.getDateOfRegister()));
        return response;
    }
}
