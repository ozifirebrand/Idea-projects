package africa.semicolon.data.repositories;

import africa.semicolon.data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {
    UserRepository repository;
    @BeforeEach
    public void setUp(){
        repository =new UserRepositoryImpl();
    }

    @Test
    void test_createUser() {
        User user = new User();
        user.setFirstName("Ozi");
        user.setLastName("Onye");
        user.setPassword("Iwaya");
        user.setPhoneNumber("08408748");
        User savedUser = repository.createUser(user);
        assertAll(
                ()-> assertEquals(user.getFirstName(), savedUser.getFirstName()),
                ()-> assertEquals(user.getPassword(), savedUser.getPassword())
        );

    }

    @Test
    void test_findAll() {
    }

    @Test
    void test_delete() {
    }

    @Test
    void test_deleteAll() {
    }

    @Test
    void test_findUserById() {
    }
}