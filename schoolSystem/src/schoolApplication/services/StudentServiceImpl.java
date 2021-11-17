package schoolApplication.services;

import schoolApplication.db.PhoenixSchoolDB;
import schoolApplication.exceptions.PhoenixStudentException;
import schoolApplication.models.Student;

public class StudentServiceImpl implements StudentService{
    private final PhoenixSchoolDB phoenixSchoolDB = new PhoenixSchoolDB();
    @Override
    public Student register(Student aStudent) throws PhoenixStudentException {
        return phoenixSchoolDB.addStudent(aStudent);
    }

    @Override
    public Student updateStudentInfo(Student aStudent) throws PhoenixStudentException {
        return null;
    }

    @Override
    public Student findStudent(String studentId) throws PhoenixStudentException {
        return phoenixSchoolDB.findStudentById(studentId);
    }
}
