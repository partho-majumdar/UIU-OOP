package Lab05.Mid_Project.University.src;

import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseTitle;
    private double courseCredit;
    private ArrayList<Student> studentlist = new ArrayList<>();
    private int numberOfStudents = 0;
    private Faculty faculty;

    public Course() {
    }

    public Course(String courseCode, String courseTitle, double courseCredit) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseCredit = courseCredit;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return this.courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public double getCourseCredit() {
        return this.courseCredit;
    }

    public void setCourseCredit(double courseCredit) {
        this.courseCredit = courseCredit;
    }

    public Faculty getFaculty() {
        return this.faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Course{" + "courseCode = '" + courseCode
                + '\'' + ", courseTitle = '" + courseTitle
                + '\'' + ", courseCredit = " + courseCredit
                + ", studentList = " + studentlist
                + ", numberOfStudents = "
                + numberOfStudents + ", faculty="
                + faculty + '}';
    }

    public void addStudent(Student other) {
        boolean flag = true;
        for (Student s1 : studentlist) {
            if (s1.equals(other)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            studentlist.add(other);
            numberOfStudents++;
            System.out.println("Student with " + other.getStudentId() + " ID added successfully");
        } else {
            System.out.println("Already exists in the course!");
        }
    }

    public void dropStudent(int sid) {
        int index = -1;
        for (int i = 0; i < studentlist.size(); i++) {
            if (studentlist.get(i).getStudentId() == sid) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            studentlist.remove(index);
            numberOfStudents = studentlist.size(); //numberOfStudents--;
            System.out.println("Student with ID: " + sid + " is deleted!");
        } else {
            System.out.println("Student doesn't exist in the course!");
        }
    }

    public void addFaculty(Faculty other) {
        this.faculty = other;
        System.out.println("Successfully faculty added");
    }

    public void dropFaculty() {
        this.faculty = null;
        System.out.println("Faculty has been dropped from the course");
    }

    public void printStudentList() {
        for (Student s : studentlist) {
            System.out.println(s.toString());
        }
    }

    public int getSNumberOfStudent() {
        return this.numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public ArrayList<Student> getStudentList() {
        return studentlist;
    }
}
