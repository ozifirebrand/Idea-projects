package africa.semicolon.jijimoji.services;

import africa.semicolon.jijimoji.dtos.requests.RegisterListerRequest;
import africa.semicolon.jijimoji.dtos.responses.RegisterListerResponse;

public interface ListerService {
    public RegisterListerResponse registerLister(RegisterListerRequest request);
}
