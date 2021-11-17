package schoolApplication.db;

import schoolApplication.enums.Gender;
import schoolApplication.exceptions.PhoenixClassException;
import schoolApplication.exceptions.PhoenixStudentException;
import schoolApplication.models.Student;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 */
public class PhoenixSchoolDB {
    private static Map<String, Student> studentDatabase = new TreeMap<>();
    private static int totalNoOfStudents=0;

    public static Map<String, Student> getStudentDatabase() {
        return studentDatabase;
    }

    private static void setStudentDatabase(Map<String, Student> database) {
        studentDatabase = database;
    }

    public static int findTotalNoOfStudents(){
        return totalNoOfStudents;
    }
    private String generateStudentId(){
        StringBuilder id = new StringBuilder("PHX");
        totalNoOfStudents++;
        id.append(totalNoOfStudents);
        return id.toString();
    }


    public Student addStudent(Student student ) throws PhoenixStudentException {
        if ( student== null ){
            throw new PhoenixStudentException("User is empty");
        }
        student.setId(generateStudentId());
        String id = student.getId();
        studentDatabase.put(id, student);
        return student;
    }

    public static Student getStudent(String id){
        return studentDatabase.get(id);
    }

    public Student findStudentById(String studentId) {
        return studentDatabase.get(studentId);
    }
}
