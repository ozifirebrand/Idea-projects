package schoolApplication.services;

import schoolApplication.exceptions.PhoenixStudentException;
import schoolApplication.models.Student;

public interface StudentService {
    Student register (Student aStudent) throws PhoenixStudentException;
}
