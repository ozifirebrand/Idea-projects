package africa.semicolon.services;

import africa.semicolon.utils.dtos.UserRequest;
import africa.semicolon.utils.dtos.UserResponse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServicesImplTest {
    UserServices services;
    @BeforeEach
    public void setUp() {
        services = new UserServicesImpl();
    }

    @AfterEach
    public void tearDown() {
    }

    public void helpMethod(){
        UserRequest request = new UserRequest();
        request.setFirstName("Eno");
        request.setLastName("Amadi");
        request.setPhoneNumber("857393774");
        request.setUsername("Moo");
        request.setPassword("urykejfb");
        services.createUser(request);
    }

    @Test
    public void test_createUser() {
        UserRequest request = new UserRequest();
        request.setFirstName("Eno");
        request.setLastName("Amadi");
        request.setPhoneNumber("857393774");
        request.setUsername("Moo");
        request.setPassword("urykejfb");
        UserResponse response = services.createUser(request);
        assertAll(
                ()->assertEquals(response.getUsername(), request.getUsername()),
                ()-> assertEquals(response.getLastName(), request.getLastName()),
                ()-> assertEquals(response.getUsername(), request.getUsername())
        );
    }

    @Test
    public void test_findUserById() {
        /*UserResponse response =*/ helpMethod();
        /*UserResponse response =*/ helpMethod();
        assertEquals(services.findAll().get(0),services.findUserById(1));
        assertEquals(services.findAll().get(1),services.findUserById(2));
    }

    @Test
    public void test_deleteUser() {
        UserRequest request = new UserRequest();
        request.setFirstName("Eno");
        request.setLastName("Amadi");
        request.setPhoneNumber("857393774");
        request.setUsername("Moo");
        request.setPassword("urykejfb");
        UserResponse response = services.createUser(request);
        services.deleteUser(response.getUserId());
        assertEquals(0, services.findAll().size());
    }

    @Test
    public void test_deleteAll() {
    }

    @Test
    public void test_findAll(){
        helpMethod();
        helpMethod();
        helpMethod();
        assertEquals(3, services.findAll().size());
    }
}