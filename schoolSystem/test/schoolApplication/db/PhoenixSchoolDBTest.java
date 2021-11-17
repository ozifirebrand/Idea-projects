package schoolApplication.db;

import org.junit.jupiter.api.*;
import schoolApplication.exceptions.PhoenixClassException;
import schoolApplication.models.Student;

import static org.junit.jupiter.api.Assertions.*;


class PhoenixSchoolDBTest {
    PhoenixSchoolDB phoenixSchoolDB;

    @BeforeEach
    void setUp() {
        phoenixSchoolDB = new PhoenixSchoolDB();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addStudent() {
        assertTrue(PhoenixSchoolDB.getStudentDatabase().isEmpty());
        Student tife = new Student("Tife", "Olanipekun");
        try {
            phoenixSchoolDB.addStudent(tife);
        }catch (PhoenixClassException ex){
            ex.printStackTrace();
        }
    }
//
//    @Test
//    void
}