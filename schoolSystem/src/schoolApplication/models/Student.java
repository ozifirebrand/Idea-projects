package schoolApplication.models;


import schoolApplication.enums.Gender;

import java.util.List;

public class Student extends SchoolUser {
    private List<Course> registeredCourses;
    public Student (String firstName, String lastName){
        this.setFirstName(firstName);
        setLastName(lastName);
    }



    public Student (String firstName, String lastName, Gender gender){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        setGender(gender);
    }

    public Student (String firstName, String lastName, Gender gender, String email){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setGender(gender);
        setEmail(email);
    }


}
