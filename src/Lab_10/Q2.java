package Lab_10;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        try {
            File f = new File("test2.txt");
            Scanner sc = new Scanner(f);

            while (sc.hasNext()) {
                String nam = sc.next();
                int id = sc.nextInt();
                double cg = sc.nextDouble();

                Student s = new Student(nam, id, cg);
                list.add(s);
            }

            list.sort(new Comparator<Student>() {
                public int compare(Student s1, Student s2) {
                    if (s1.roll > s2.roll) {
                        return 1;
                    } else if (s1.roll < s2.roll) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            });

            for (Student s : list) {
                System.out.println(s.name + " " + s.roll + " " + s.cgpa);
            }

            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Student {
    String name;
    int roll;
    double cgpa;

    public Student(String name, int roll, double cgpa) {
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
    }
}

// read data from file and sort using id
