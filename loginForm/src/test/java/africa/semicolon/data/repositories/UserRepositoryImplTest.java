package africa.semicolon.data.repositories;

import africa.semicolon.data.models.User;
import africa.semicolon.utils.dtos.UserDoesNotExistException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {
    UserRepository repository;
    @BeforeEach
    public void setUp(){
        repository = new UserRepositoryImpl();
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
    void test_delete() {
        User user1 = testMethod();
        User user2 = testMethod();
        assertEquals(2, repository.findAll().size());
        repository.delete(user1);
        assertEquals(1, repository.findAll().size());
        repository.delete(user2);
        assertEquals(0, repository.findAll().size());
    }

    @Test
    public void test_throwsException_ifNonExistentUserIsDeleted(){
        User user1 = testMethod();
        testMethod();
        assertEquals(2, repository.findAll().size());
        repository.delete(user1);
        assertEquals(1, repository.findAll().size());
        assertThrows(UserDoesNotExistException.class, ()-> repository.delete(user1));
    }

    @Test
    void test_deleteAll() {

    }

    @Test
    void test_findUserById() {
    }
}