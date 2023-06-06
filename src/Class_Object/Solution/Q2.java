package Class_Object.Solution;

public class Q2 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "John";
        stu.roll_no = 2;

        System.out.println("Name: " + stu.name + ", Roll: " + stu.roll_no);
    }
}


class Student {
    String name;
    int roll_no;
}

/*
 * Create a class named 'Student' with String variable 'name' and integer
 * variable 'roll_no'. Assign the value of roll_no as '2' and that of name as
 * "John" by creating an object of the class Student.
 */