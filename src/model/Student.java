package model;

public class Student {

    private int id;
    private String name;
    private String email;
    private String course;
    private String phone;

    // Default Constructor
    public Student() {

    }

    // Constructor
    public Student(String name, String email,
                   String course, String phone) {

        this.name = name;
        this.email = email;
        this.course = course;
        this.phone = phone;
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public String getPhone() {
        return phone;
    }

    // Setter Methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}