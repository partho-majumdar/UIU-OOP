package OOP_4_Pillars.Solution.Solution_02;

public class OutdoorPatient extends Patient {
    private String specialty;
    private double consultationFee;

    public OutdoorPatient(String name, int age, int systolic, int diastolic, int diabetesPoint, String specialty,
                          double consultationFee) {
        super(name, age, systolic, diastolic, diabetesPoint);
        this.specialty = specialty;
        this.consultationFee = consultationFee;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    @Override
    public double getInvoice() {
        return getConsultationFee();
    }

    @Override
    public String toString() {
        return super.toString() + "\nOutdoorPatient{" +
                "specialty='" + specialty + '\'' +
                ", consultationFee=" + consultationFee +
                '}';
    }
}
