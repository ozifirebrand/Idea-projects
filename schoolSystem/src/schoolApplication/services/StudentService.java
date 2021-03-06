package schoolApplication.services;

import schoolApplication.exceptions.PhoenixStudentException;
import schoolApplication.models.Student;

public interface StudentService {
    Student register (Student aStudent) throws PhoenixStudentException;
    Student updateStudentInfo (Student aStudent) throws PhoenixStudentException;
    Student findStudent(String studentId) throws PhoenixStudentException;
}
