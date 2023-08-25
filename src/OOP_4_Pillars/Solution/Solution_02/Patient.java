package OOP_4_Pillars.Solution.Solution_02;

public abstract class Patient implements Comparable<Patient> {
    private String name;
    private int age;
    private int systolic;
    private int diastolic;
    private int diabetesPoint;

    public abstract double getInvoice();

    public Patient(String name, int age, int systolic, int diastolic, int diabetesPoint) {
        this.name = name;
        this.age = age;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.diabetesPoint = diabetesPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    public int getDiabetesPoint() {
        return diabetesPoint;
    }

    public void setDiabetesPoint(int diabetesPoint) {
        this.diabetesPoint = diabetesPoint;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", systolic=" + systolic +
                ", diastolic=" + diastolic +
                ", diabetesPoint=" + diabetesPoint +
                '}';
    }

    // "this" < "other" hole sort in descending order
    @Override
    public int compareTo(Patient other) {
        if (this.getAge() < other.getAge()) {
            return 1;
        } else if (this.getAge() == other.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }

    public String getPatientType() {
        if (this instanceof OutdoorPatient) {
            return "Outdoor";
        } else if (this instanceof IndoorPatient) {
            return "Indoor";
        } else {
            return "Unknown";
        }
    }
}
