package schoolApplication.db;

import schoolApplication.exceptions.PhoenixClassException;
import schoolApplication.models.Student;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 */
public class PhoenixSchoolDB {
    private static Map<String, Student> studentDatabase = new TreeMap<>();
    private int totalNoOfStudents=0;

    public static Map<String, Student> getStudentDatabase() {
        return studentDatabase;
    }

    private static void setStudentDatabase(Map<String, Student> database) {
        studentDatabase = database;
    }

    private String generateStudentId(){
        StringBuilder id = new StringBuilder("PHX");
        totalNoOfStudents++;
        id.append(totalNoOfStudents);
        return id.toString();
    }


    public void addStudent(Student student ) throws PhoenixClassException{
        if ( student== null ){
            throw new PhoenixClassException("User is empty");
        }
        studentDatabase.put(generateStudentId(), student);
    }
}
