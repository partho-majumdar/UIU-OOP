package Lab05.Mid_Project.University;

import Lab05.Mid_Project.University.src.Course;
import Lab05.Mid_Project.University.src.Faculty;
import Lab05.Mid_Project.University.src.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> studentsMainList = new ArrayList<>();
    public static ArrayList<Faculty> facultiesMainList = new ArrayList<>();
    public static ArrayList<Course> coursesMainList = new ArrayList<>();

    public static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        while (true) {
            System.out.println();
            System.out.println("1. Add\n2. Delete\n3. Update\n4. Print\n5. Search\n0. Exit");
            System.out.print("Enter option: ");
            int ip = input.nextInt();

            if (ip == 0) {
                break;
            }

            if (ip == 1) {
                System.out.println();
                System.out.println("a. Add a student\nb. Add a faculty" +
                        "\nc. Add a course\nd. Add a student to a course" +
                        "\ne. Add a faculty to a course\nx. Return to main menu");

                System.out.print("Enter any option: ");
                char ip1 = input.next().charAt(0);

                if (ip1 == 'x') {
                    continue;

                } else if (ip1 == 'a') {
                    System.out.println("ID: ");
                    int id = input.nextInt();

                    System.out.println("Name: ");
                    String name = input.next();

                    System.out.println("CGPA: ");
                    double cg = input.nextDouble();

                    Student s = new Student(id, name, cg);
                    addAStudent(s, s.getStudentId());

                } else if (ip1 == 'b') {
                    System.out.println("ID: ");
                    int id = input.nextInt();

                    System.out.println("Name: ");
                    String name = input.next();

                    System.out.println("Position: ");
                    String position = input.next();

                    Faculty f = new Faculty(id, name, position);
                    addAFaculty(f, f.getFacultyId());

                } else if (ip1 == 'c') {
                    System.out.println("Course code: ");
                    String code = input.next();

                    System.out.println("Course title: ");
                    String name = input.next();

                    System.out.println("Credit: ");
                    double cred = input.nextDouble();

                    Course c = new Course(code, name, cred);
                    addACourse(c, c.getCourseCode());

                } else if (ip1 == 'd') {
                    System.out.println("Course code: ");
                    String courseCode = input.next();

                    System.out.println("Student ID: ");
                    int sid = input.nextInt();

                    addAStudentToACourse(courseCode, sid);

                } else if (ip1 == 'e') {
                    System.out.println("Course code: ");
                    String courseCode = input.next();

                    System.out.println("Faculty ID: ");
                    int fid = input.nextInt();

                    addAFacultyToACourse(courseCode, fid);
                }

            } else if (ip == 2) {
                System.out.println();
                System.out.println("a. Delete a student\nb. Delete a faculty" +
                        "\nc. Delete a course\nd. Delete a student to a course" +
                        "\ne. Delete a faculty to a course\nx. Return to main menu");

                System.out.print("Enter any option: ");
                char ip2 = input.next().charAt(0);

                if (ip2 == 'x') {
                    continue;

                } else if (ip2 == 'a') {
                    System.out.println("Enter student id that you want to delete: ");
                    int sid = input.nextInt();
                    deleteAStudent(sid);

                } else if (ip2 == 'b') {
                    System.out.println("Enter course code that you want to delete: ");
                    String courseCode = input.next();
                    deleteACourse(courseCode);

                } else if (ip2 == 'c') {
                    System.out.println("Enter faculty id that you want to delete: ");
                    int fId = input.nextInt();
                    deleteAFaculty(fId);

                } else if (ip2 == 'd') {
                    System.out.println("Enter course code to delete student from course: ");
                    String cCode = input.next();
                    System.out.println("Enter student id to delete student from course: ");
                    int sID = input.nextInt();
                    deleteAStudentFromCourse(cCode, sID);

                } else if (ip2 == 'e') {
                    System.out.println("Enter course code to remove a faculty: ");
                    String cCode = input.next();
                    deleteAFacultyFromCourse(cCode);
                }

            } else if (ip == 3) {
                System.out.println();
                System.out.println("a. Update a student\nb. Update a faculty" +
                        "\nc. Update a course\nd. Update a student to a course" +
                        "\ne. Update a faculty to a course\nx. Return to main menu");

                System.out.print("Enter any option: ");
                char ip3 = input.next().charAt(0);

                if (ip3 == 'x') {
                    continue;

                } else if (ip3 == 'a') {
                    System.out.println("Enter student id to update info: ");
                    int sId = input.nextInt();
                    updateAStudent(sId);

                } else if (ip3 == 'b') {
                    System.out.println("Enter faculty id to update info: ");
                    int fId = input.nextInt();
                    updateAFaculty(fId);

                } else if (ip3 == 'c') {
                    System.out.println("Enter course code to update info: ");
                    String cCode = input.next();
                    updateACourse(cCode);

                } else if (ip3 == 'd') {
                    System.out.println("Enter course code to update a student from a course: ");
                    String cCode = input.next();

                    System.out.println("Enter student id to update a student from a course: ");
                    int sId = input.nextInt();
                    updateAStudentToACourse(cCode, sId);

                } else if (ip3 == 'e') {
                    System.out.println("Enter course cod to update a faculty to a course: ");
                    String cCode = input.next();
                    updateAFacultyToACourse(cCode);

                }
            } else if (ip == 4) {
                System.out.println();
                System.out.println("a. Print all students\nb. Print all courses" +
                        "\nc. Print all faculties\nd. Print information of a student" +
                        "\ne. Print information of a course\nf. Print information of a faculty" +
                        "\ng. Print student list and faculty information of a course" +
                        "\nh. Print courses taken by a student\nx. Return to main menu");

                System.out.print("Enter any option: ");
                char ip4 = input.next().charAt(0);

                if (ip4 == 'x') {
                    continue;

                } else if (ip4 == 'a') {
                    printAllStudent();

                } else if (ip4 == 'b') {
                    printAllCourse();

                } else if (ip4 == 'c') {
                    printAllFaculty();

                } else if (ip4 == 'd') {
                    System.out.print("Enter student id to see her/him information: ");
                    int stuId = input.nextInt();
                    printInfoOfAStudent(stuId);

                } else if (ip4 == 'e') {
                    System.out.print("Enter course code to see its information: ");
                    String courseCode = input.next();
                    printInfoOfACourse(courseCode);

                } else if (ip4 == 'f') {
                    System.out.print("Enter faculty id to see her/him information: ");
                    int fId = input.nextInt();
                    printInfoOfAFaculty(fId);

                } else if (ip4 == 'g') {
                    printStudentListAndFacultyInfo();

                } else if (ip4 == 'h') {
                    System.out.println("Enter student id to see her/him courses: ");
                    int sid = input.nextInt();
                    printCourseTakenByStudent(sid);

                }
            } else if (ip == 5) {
                System.out.println();
                System.out.println("a. Search a students\nb. Search a course" +
                        "\nc. Search a faculty\nd. Search whether a student takes a course" +
                        "\ne. Search whether a faculty teaches a course\nf. Search courses taken by a student" +
                        "\ng. Search course taught by a faculty\nx. Return to main menu");

                System.out.print("Enter any option: ");
                char ip5 = input.next().charAt(0);

                if (ip5 == 'x') {
                    continue;
                } else if (ip5 == 'a') {

                } else if (ip5 == 'b') {

                } else if (ip5 == 'c') {

                } else if (ip5 == 'd') {

                } else if (ip5 == 'e') {

                } else if (ip5 == 'f') {

                } else if (ip5 == 'g') {

                }
            }
        }
    } // End of public static void main

    // -----------------------------------------------------------------------------------------------------------------
    // add new student
    public static void addAStudent(Student s, int sId) {
        boolean flag = true;
        for (Student e : studentsMainList) {
            if (e.equals(s) || e.getStudentId() == sId) {
                flag = false;
                break;
            }
        }
        if (flag) {
            studentsMainList.add(s);
            System.out.println("Student added!");
        } else {
            System.out.println("Already exists! or student ID can not be same");
        }
    }

    // add new faculty
    public static void addAFaculty(Faculty f, int fID) {
        boolean flag = true;
        for (Faculty f1 : facultiesMainList) {
            if (f1.equals(f) || f1.getFacultyId() == fID) {
                flag = false;
                break;
            }
        }
        if (flag) {
            facultiesMainList.add(f);
            System.out.println("Faculty added");
        } else {
            System.out.println("Already exist or faculty ID can not be same");
        }
    }

    // add new course
    public static void addACourse(Course c, String cCode) {
        boolean flag = true;
        for (Course c1 : coursesMainList) {
            if (c1.equals(c) || c1.getCourseCode().equals(cCode)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            coursesMainList.add(c);
            System.out.println("Course added");
        } else {
            System.out.println("Already exist or course Code can not be same");
        }
    }

    // add a student to a course
    public static void addAStudentToACourse(String courseCode, int sid) {
        int courseIndex = -1, studentIndex = -1;
        for (int i = 0; i < coursesMainList.size(); i++) {
            if (courseCode.equals(coursesMainList.get(i).getCourseCode())) {
                courseIndex = i;
                break;
            }
        }
        for (int i = 0; i < studentsMainList.size(); i++) {
            if (sid == studentsMainList.get(i).getStudentId()) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex != -1 && courseIndex != -1) {
            coursesMainList.get(courseIndex).addStudent(studentsMainList.get(studentIndex));
            System.out.println("Successfully add student to a course");
        } else {
            System.out.println("Course or student not found");
        }
    }

    // add a faculty to a course
    public static void addAFacultyToACourse(String courseCode, int facultyID) {
        int courseIndex = -1, facultyIndex = -1;
        for (int i = 0; i < coursesMainList.size(); i++) {
            if (courseCode.equals(coursesMainList.get(i).getCourseCode())) {
                courseIndex = i;
                break;
            }
        }
        for (int i = 0; i < facultiesMainList.size(); i++) {
            if (facultyID == facultiesMainList.get(i).getFacultyId()) {
                facultyIndex = i;
                break;
            }
        }
        if (courseIndex != -1 && facultyIndex != -1) {
            coursesMainList.get(courseIndex).addFaculty(facultiesMainList.get(facultyIndex));
        } else {
            System.out.println("Course or faculty not found");
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    // delete a student
    public static void deleteAStudent(int sId) {
        int studentIndex = -1;
        for (int i = 0; i < studentsMainList.size(); i++) {
            if (studentsMainList.get(i).getStudentId() == sId) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex != -1) {
            studentsMainList.remove(studentIndex);
            System.out.println("Successfully remove a student");
        } else {
            System.out.println("Student not found");
        }
    }

    // delete a course
    public static void deleteACourse(String cCode) {
        int courseIndex = -1;
        for (int i = 0; i < coursesMainList.size(); i++) {
            if (coursesMainList.get(i).getCourseCode().equals(cCode)) {
                courseIndex = i;
            }
        }
        if (courseIndex != -1) {
            coursesMainList.remove(courseIndex);
            System.out.println("Successfully remove a course");
        } else {
            System.out.println("Course not found");
        }
    }

    // delete a faculty
    public static void deleteAFaculty(int fId) {
        int facultyIndex = -1;
        for (int i = 0; i < facultiesMainList.size(); i++) {
            if (facultiesMainList.get(i).getFacultyId() == fId) {
                facultyIndex = i;
                break;
            }
        }
        if (facultyIndex != -1) {
            facultiesMainList.remove(facultyIndex);
            System.out.println("Successfully remove a faculty");
        } else {
            System.out.println("Faculty not found");
        }
    }

    // delete a student from a course
    public static void deleteAStudentFromCourse(String courseCode, int studentId) {
        int courseIndex = -1;
        for (int i = 0; i < coursesMainList.size(); i++) {
            if (coursesMainList.get(i).getCourseCode().equals(courseCode)) {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex != -1) {
            Course c = coursesMainList.get(courseIndex);
            ArrayList<Student> studentList = c.getStudentList();
            int studentIndex = -1;
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getStudentId() == studentId) {
                    studentIndex = i;
                    break;
                }
            }
            if (studentIndex != -1) {
                studentList.remove(studentIndex);
                c.setNumberOfStudents(studentList.size());
                System.out.println("Successfully student removed from the course");
            } else {
                System.out.println("Student not enrolled in the course ");
            }
        } else {
            System.out.println("Course not found!");
        }
    }

    // delete a faculty from a course
    public static void deleteAFacultyFromCourse(String courseCode) {
        int courseIndex = -1;
        for (int i = 0; i < coursesMainList.size(); i++) {
            if (coursesMainList.get(i).getCourseCode().equals(courseCode)) {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex != -1) {
            Course c = coursesMainList.get(courseIndex);
            Faculty faculty = c.getFaculty();
            if (faculty != null) {
                c.dropFaculty();
                System.out.println("Successfully faculty removed from the course");
            } else {
                System.out.println("No faculty found in the course ");
            }
        } else {
            System.out.println("Course not found!");
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    // update a student
    public static void updateAStudent(int sID) {
        int studentIndex = -1;
        for (int i = 0; i < studentsMainList.size(); i++) {
            if (studentsMainList.get(i).getStudentId() == sID) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex != -1) {
            Student newStudent = studentsMainList.get(studentIndex);

            System.out.println("Enter student new id: ");
            int newStuId = input.nextInt();
            newStudent.setStudentId(newStuId);

            System.out.println("Enter student new name: ");
            String newStuName = input.next();
            newStudent.setStudentName(newStuName);

            System.out.println("Enter student new cgpa: ");
            double newStuCgpa = input.nextDouble();
            newStudent.setStudentCgpa(newStuCgpa);

            System.out.println("Student info updated");

        } else {
            System.out.println("Student not found");
        }
    }

    // update a course
    public static void updateACourse(String cCode) {
        int courseIndex = -1;
        for (int i = 0; i < coursesMainList.size(); i++) {
            if (coursesMainList.get(i).getCourseCode().equals(cCode)) {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex != -1) {
            Course newCourse = coursesMainList.get(courseIndex);

            System.out.println("Enter course new code: ");
            String newCCode = input.next();
            newCourse.setCourseCode(newCCode);

            System.out.println("Enter course new title: ");
            String newCTitle = input.next();
            newCourse.setCourseTitle(newCTitle);

            System.out.println("Enter course new credit: ");
            double newCCredit = input.nextDouble();
            newCourse.setCourseCredit(newCCredit);

            System.out.println("Course info updated");

        } else {
            System.out.println("Course not found");
        }
    }

    // update a faculty
    public static void updateAFaculty(int fId) {
        int courseIndex = -1;
        for (int i = 0; i < facultiesMainList.size(); i++) {
            if (facultiesMainList.get(i).getFacultyId() == fId) {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex != -1) {
            Faculty newFaculty = facultiesMainList.get(courseIndex);

            System.out.print("Enter faculty new id: ");
            int newFid = input.nextInt();
            newFaculty.setFacultyId(newFid);

            System.out.println("Enter faulty new name: ");
            String newFName = input.next();
            newFaculty.setFacultyName(newFName);

            System.out.print("Enter faculty new position: ");
            String newFPosition = input.next();
            newFaculty.setFacultyPosition(newFPosition);

            System.out.println("Faculty info updated");

        } else {
            System.out.println("Faculty not found");
        }
    }

    // update a student to a course
    public static void updateAStudentToACourse(String cCode, int sId) {
        int courseIndex = -1;
        for (int i = 0; i < coursesMainList.size(); i++) {
            if (coursesMainList.get(i).getCourseCode().equals(cCode)) {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex != -1) {
            Course c = coursesMainList.get(courseIndex);
            ArrayList<Student> newStuList = c.getStudentList();

            int studentIndex = -1;
            for (int i = 0; i < newStuList.size(); i++) {
                if (newStuList.get(i).getStudentId() == sId) {
                    studentIndex = i;
                    break;
                }
            }
            if (studentIndex != -1) {
                Student newStudent = newStuList.get(studentIndex);

                System.out.println("Enter student new id: ");
                int newStuId = input.nextInt();
                newStudent.setStudentId(newStuId);

                System.out.println("Enter student new name: ");
                String newStuName = input.next();
                newStudent.setStudentName(newStuName);

                System.out.println("Enter student new cgpa: ");
                double newStuCgpa = input.nextDouble();
                newStudent.setStudentCgpa(newStuCgpa);

                System.out.println("Student info updated in a course");
            } else {
                System.out.println("Student not enrolled in the course ");
            }
        } else {
            System.out.println("Course not found!");
        }
    }

    // update a faculty to a course
    public static void updateAFacultyToACourse(String cCode) {
        int courseIndex = -1;
        for (int i = 0; i < coursesMainList.size(); i++) {
            if (coursesMainList.get(i).getCourseCode().equals(cCode)) {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex != -1) {
            Course c = coursesMainList.get(courseIndex);
            Faculty newFaculty = c.getFaculty();
            if (newFaculty != null) {

                System.out.print("Enter faculty new id: ");
                int newFid = input.nextInt();
                newFaculty.setFacultyId(newFid);

                System.out.println("Enter faulty new name: ");
                String newFName = input.next();
                newFaculty.setFacultyName(newFName);

                System.out.print("Enter faculty new position: ");
                String newFPosition = input.next();
                newFaculty.setFacultyPosition(newFPosition);

                System.out.println("Faculty info updated");
            } else {
                System.out.println("No faculty is found");
            }
        } else {
            System.out.println("Course not found!");
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    // print all student
    public static void printAllStudent() {
        for (Student s : studentsMainList) {
            System.out.println(s.toString());
        }
    }

    // print all course
    public static void printAllCourse() {
        for (Course c : coursesMainList) {
            System.out.println(c.toString());
        }
    }

    // print all faculty
    public static void printAllFaculty() {
        for (Faculty f : facultiesMainList) {
            System.out.println(f.toString());
        }
    }

    // print information of a student
    public static void printInfoOfAStudent(int sID) {
        for (Student s : studentsMainList) {
            if (s.getStudentId() == sID) {
                System.out.println(s.toString());
            }
        }
    }

    // print information of a course
    public static void printInfoOfACourse(String cCode) {
        for (Course c : coursesMainList) {
            if (c.getCourseCode().equals(cCode)) {
                System.out.println(c.toString());
            }
        }
    }

    // print information of a faculty
    public static void printInfoOfAFaculty(int fID) {
        for (Faculty f : facultiesMainList) {
            if (f.getFacultyId() == fID) {
                System.out.println(f.toString());
            }
        }
    }

    // print student list and faculty information
    public static void printStudentListAndFacultyInfo() {
        for (Course c : coursesMainList) {
            System.out.println(c.getStudentList().toString());
            Faculty faculty = c.getFaculty();
            if (faculty != null) {
                System.out.println(faculty.toString());
            } else {
                System.out.println("Faculty not found");
                System.out.println();
            }
        }
    }

    // Print courses taken by a student
    public static void printCourseTakenByStudent(int sId) {
        for (Course c : coursesMainList) {
            ArrayList<Student> studentsList = c.getStudentList();
            for (Student s : studentsList) {
                if (s.getStudentId() == sId) {
                    System.out.println("Course Code: " + c.getCourseCode());
                    System.out.println("Course Title: " + c.getCourseTitle());
                    System.out.println("Course Credit: " + c.getCourseCredit());
                    System.out.println();
                }
            }
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    // search a student

    // search a course

    // search a faculty

    // search whether a student takes a course

    // search whether a faculty teaches a course

    // search courses taken by a student

    // search course taught by a faculty

    //------------------------------------------------------------------------------------------------------------------
}