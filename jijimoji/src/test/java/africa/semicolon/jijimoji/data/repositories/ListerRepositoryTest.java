package africa.semicolon.jijimoji.data.repositories;

import africa.semicolon.jijimoji.data.models.Lister;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class ListerRepositoryTest {
    @Autowired
    private ListerRepository listerRepository;

    @Test
    public void repositorySaveTest(){
        Lister lister= new Lister();
        lister.setFullName("Okoro Kelveen");
        lister.setEmail("okorokelveen99@gmail.com");
        lister.setLocation("Sabo");
        lister.setPhoneNumber("0890858394");
        Lister savedLister = listerRepository.save(lister);
        assertEquals("Okoro Kelveen", savedLister.getFullName());
    }

}