package schoolApplication.models;

public class Course {
    private String id;
    private String courseName;
    private String departmentName;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public Course(String courseName, String departmentName){
        this(courseName);
        this.departmentName = departmentName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
