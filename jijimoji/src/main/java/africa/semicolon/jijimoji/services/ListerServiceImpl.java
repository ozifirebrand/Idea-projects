package africa.semicolon.jijimoji.services;

import africa.semicolon.jijimoji.ModelMapper;
import africa.semicolon.jijimoji.data.models.Lister;
import africa.semicolon.jijimoji.data.repositories.ListerRepository;
import africa.semicolon.jijimoji.dtos.requests.RegisterListerRequest;
import africa.semicolon.jijimoji.dtos.responses.RegisterListerResponse;
import africa.semicolon.jijimoji.exceptions.DuplicateEmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ListerServiceImpl implements ListerService {
    @Autowired
    private ListerRepository listerRepository;
    @Override
    public RegisterListerResponse registerLister(RegisterListerRequest request) {
        Optional<Lister> optionalLister = listerRepository.findListerByEmail(request.getEmail());
        if ( optionalLister.isPresent()) throw new DuplicateEmailException(request.getEmail()+ "Duplicate email");

        Lister lister = ModelMapper.map(request);
        Lister savedLister = listerRepository.save(lister);
        return ModelMapper.map(savedLister);
    }
}
