package Lab05.Mid_Project.University;

import Lab05.Mid_Project.University.src.Course;
import Lab05.Mid_Project.University.src.Faculty;
import Lab05.Mid_Project.University.src.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Faculty> faculties = new ArrayList<>();
    public static ArrayList<Course> courses = new ArrayList<>();

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

                if (ip1 == 'z') {
                    continue;
                } else if (ip1 == 'a') {
                    System.out.println("ID: ");
                    int id = input.nextInt();
                    System.out.println("Name: ");
                    String name = input.next();
                    System.out.println("CGPA: ");
                    double cg = input.nextDouble();
                    Student s = new Student(id, name, cg);
                    addAStudent(s);
                } else if (ip1 == 'b') {
                    System.out.println("ID: ");
                    int id = input.nextInt();
                    System.out.println("Name: ");
                    String name = input.next();
                    System.out.println("Position: ");
                    String position = input.next();
                    Faculty f = new Faculty(id, name, position);
                    addAFaculty(f);
                } else if (ip1 == 'c') {
                    System.out.println("Course code: ");
                    String code = input.next();
                    System.out.println("Course title: ");
                    String name = input.next();
                    System.out.println("Credit: ");
                    double cred = input.nextDouble();
                    Course c = new Course(code, name, cred);
                    addACourse(c);
                } else if (ip1 == 'd') {
                    System.out.println("Course code: ");
                    String courseCode = input.next();
                    System.out.println("Student ID: ");
                    int sid = input.nextInt();
                    addAStudentCourse(courseCode, sid);
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

                } else if (ip2 == 'b') {

                } else if (ip2 == 'c') {

                } else if (ip2 == 'd') {

                } else if (ip2 == 'e') {

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

                } else if (ip3 == 'b') {

                } else if (ip3 == 'c') {

                } else if (ip3 == 'd') {

                } else if (ip3 == 'e') {

                }
            } else if (ip == 4) {
                System.out.println();
                System.out.println("a. Print all students\nb. Print all courses" +
                        "\nc. Print all faculties\nd. Print information of a student" +
                        "\ne. Print information of a student\nf. Print information of a course" +
                        "\ng. Print student list and faculty information of a course" +
                        "\nh. Print courses taken by a student\nx. Return to main menu");

                System.out.print("Enter any option: ");
                char ip4 = input.next().charAt(0);

                if (ip4 == 'x') {
                    continue;
                } else if (ip4 == 'a') {

                } else if (ip4 == 'b') {

                } else if (ip4 == 'c') {

                } else if (ip4 == 'd') {

                } else if (ip4 == 'e') {

                } else if (ip4 == 'f') {

                } else if (ip4 == 'g') {

                } else if (ip4 == 'h') {

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

    public static void addAStudent(Student s) {
        boolean flag = true;
        for (Student e : students) {
            if (e.equals(s)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            students.add(s);
            System.out.println("Student added!");
        } else System.out.println("Already exists!");

    }

    public static void addAFaculty(Faculty f) {
        faculties.add(f);
    }

    public static void addACourse(Course c) {
        courses.add(c);
    }

    public static void addAStudentCourse(String courseCode, int sid) {
        int courseIndex = -1, studentIndex = -1;
        for (int i = 0; i < courses.size(); i++) {
            if (courseCode.equals(courses.get(i).getCourseCode())) {
                courseIndex = i;
                break;
            }
        }
        for (int i = 0; i < students.size(); i++) {
            if (sid == students.get(i).getStudentId()) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex != -1 && courseIndex != -1) {
            courses.get(courseIndex).addStudent(students.get(studentIndex));
        }
    }
}