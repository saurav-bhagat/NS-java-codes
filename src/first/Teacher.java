package first;

public class Teacher extends Person {
    private String schoolName;
    private String teacherId;
    private String subject;

    public Teacher(String name, int age, String schoolName, String teacherId, String subject) {
        super(name, age);
        this.schoolName = schoolName;
        this.teacherId = teacherId;
        this.subject = subject;
    }

    public String getSchoolName(){
        return this.schoolName;
    }

    public String getTeacherId(){
        return this.teacherId;
    }

    public String getSubject(){
        return this.subject;
    }
}

// super is a function which is called inside constructor of child class
// use of super function is to call the constructor of parent class
