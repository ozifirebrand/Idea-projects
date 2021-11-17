package schoolApplication.services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import schoolApplication.db.PhoenixSchoolDB;
import schoolApplication.enums.Gender;
import schoolApplication.exceptions.PhoenixStudentException;
import schoolApplication.models.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImplTest {

    StudentService service;
    @BeforeEach
    void setUp() {
        service = new StudentServiceImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void register() {
        Student tife = new Student("Tife", "Olanipekun", Gender.MALE);
        assertEquals(0, PhoenixSchoolDB.findTotalNoOfStudents());
        try {
            tife = service.register(tife);
        }catch (PhoenixStudentException ex){
            ex.printStackTrace();
        }
        assertEquals(1, PhoenixSchoolDB.findTotalNoOfStudents());
        assertEquals("PHX1", tife.getId());
    }

    @Test
    void registerNullStudent(){
        assertEquals(0, PhoenixSchoolDB.findTotalNoOfStudents());
        assertThrows(PhoenixStudentException.class, ()->service.register(null));
    }

    @Test
    void updateStudent(){
        Student tife = new Student("Tife", "Olanipekun", Gender.MALE);
        assertEquals(0, PhoenixSchoolDB.findTotalNoOfStudents());
        try {
            tife = service.register(tife);
        }catch (PhoenixStudentException ex){
            ex.printStackTrace();
        }
        assertEquals(1, PhoenixSchoolDB.findTotalNoOfStudents());
        assertEquals("PHX1", tife.getId());
    }

    public void helpMethod(){
        Student tife = new Student("Tife", "Olanipekun", Gender.MALE);
        assertEquals(0, PhoenixSchoolDB.findTotalNoOfStudents());
        try {
            tife = service.register(tife);
        }catch (PhoenixStudentException ex){
            ex.printStackTrace();
        }
    }
    @Test
    void findStudent(){
        helpMethod();
        assertEquals(1, PhoenixSchoolDB.findTotalNoOfStudents());
        try {
            Student tife = service.findStudent("PHX1");
            assertNotNull(tife);
        }catch (PhoenixStudentException ex){
            ex.printStackTrace();
        }

        assertEquals(2,PhoenixSchoolDB.findTotalNoOfStudents());
        assertThrows(PhoenixStudentException.class, ()-> service.findStudent(null));
    }
}