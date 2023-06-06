package Class_Object.Solution;

public class Q3 {
    public static void main(String[] args) {
        Studentt John = new Studentt();
        John.setDetails(21, "Mirpur 12", "01712345678");
        John.printDetails();

        System.out.println();

        Studentt Sam = new Studentt();
        Sam.setDetails(34, "Banani 12", "2441139");
        Sam.printDetails();

        System.out.println();

        Studentt Tom = new Studentt();
        Tom.setDetails(54, "01732280764", "Dhaka East");
        Tom.printDetails();
    }
}

class Studentt {
    int roll_num;
    String phone_num;
    String address;

    void setDetails(int roll, String phn_num, String address1) {
        this.roll_num = roll;
        this.phone_num = phn_num;
        this.address = address1;
    }

    void printDetails() {
        System.out.println("Roll: " + roll_num);
        System.out.println("Phone number: " + phone_num);
        System.out.println("Address: " + address);
    }
}

/*
Assign and print the roll number, phone number and address of two students having names
"Sam" and "John" respectively by creating two objects of class 'Student'.
 */