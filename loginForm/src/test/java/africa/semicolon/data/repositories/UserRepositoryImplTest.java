package africa.semicolon.data.repositories;

import africa.semicolon.data.models.User;
import africa.semicolon.utils.exceptions.UserDoesNotExistException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {
    UserRepository repository;
    @BeforeEach
    public void setUp(){
        repository = new UserRepositoryImpl();
    }

    @AfterEach
    public void tearDown(){
        repository.deleteAll();
    }
    public User testMethod(){
        User user = new User();
        user.setFirstName("Ozi");
        user.setLastName("Onye");
        user.setPassword("Iwaya");
        user.setPhoneNumber("08408748");
        repository.save(user);
        return user;
    }

    @Test
    void test_createUser() {
        User user = testMethod();
        User savedUser = repository.save(user);
        assertAll(
                ()-> assertEquals(user.getFirstName(), savedUser.getFirstName()),
                ()-> assertEquals(user.getPassword(), savedUser.getPassword())
        );

    }

    @Test
    public void test_cantHaveTwoUsers(){
        User user =testMethod();
        user.setPhoneNumber("8579978909");
        User updatedUser = repository.save(user);
        assertEquals(user, updatedUser);
        assertEquals(1, repository.findAll().size());
    }

    @Test
    void test_findAll() {
        testMethod();
        testMethod();
        assertEquals(2, repository.findAll().size());
    }

    @Test
    void test_deleteById() {
        User user1 = testMethod();
        User user2 = testMethod();
        assertEquals(2, repository.findAll().size());
        repository.deleteById(user1.getUserId());
        assertEquals(1, repository.findAll().size());
        repository.deleteById(user2.getUserId());
        assertEquals(0, repository.findAll().size());
    }

    @Test
    public void test_throwsException_ifNonExistentUserIsDeleted(){
        User user1 = testMethod();
        testMethod();
        assertEquals(2, repository.findAll().size());
        repository.deleteById(user1.getUserId());
        assertEquals(1, repository.findAll().size());
        assertThrows(UserDoesNotExistException.class, ()-> repository.deleteById(user1.getUserId()));
    }

    @Test
    void test_deleteAll() {
        testMethod();
        testMethod();
        repository.deleteAll();
        assertEquals(0, repository.findAll().size());
    }

    @Test
    void test_findUserById() {
        User user1 = testMethod();
        testMethod();
        assertEquals(2, repository.findAll().size());
        assertEquals(user1, repository.findUserById(1));
    }
}