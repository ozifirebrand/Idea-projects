package africa.semicolon.services;

import africa.semicolon.data.models.User;
import africa.semicolon.utils.dtos.requests.UserInputRequest;
import africa.semicolon.utils.dtos.requests.UserRequest;
import africa.semicolon.utils.dtos.responses.UserResponse;
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

    public UserResponse helpMethod(){
        UserRequest request = new UserRequest();
        request.setFirstName("Eno");
        request.setLastName("Amadi");
        request.setPhoneNumber("857393774");
        request.setUsername("Moo");
        request.setPassword("urykejfb");
        return services.createUser(request);
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
        services.deleteUserById(response.getUserId());
        assertEquals(0, services.findAll().size());
    }

    @Test
    public void test_deleteAll() {
        helpMethod();
        helpMethod();
        helpMethod();
        helpMethod();
        services.deleteAll();
        assertEquals(0, services.findAll().size());
    }

    @Test
    public void test_findAll(){
        helpMethod();
        helpMethod();
        helpMethod();
        assertEquals(3, services.findAll().size());
    }

    @Test
    public void test_deleteAUser(){
        helpMethod();
        helpMethod();
        UserResponse response2 =helpMethod();
        assertEquals(3, services.findAll().size());
        services.deleteUser(services.findUserById(response2.getUserId()));
        assertEquals(2, services.findAll().size());
    }

//    @Test
//    public void test_deleteByWhatever(){
//        helpMethod();
//        UserInputRequest request = new UserInputRequest();
//        request.setPassword("urykejfb");
//        request.setPhoneNumber("857393774");
//        services.deleteUser(request);
//        assertEquals(0, services.findAll().size());

//    }

}