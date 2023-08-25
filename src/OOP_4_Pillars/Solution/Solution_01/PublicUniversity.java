package OOP_4_Pillars.Solution.Solution_01;

public class PublicUniversity extends University {
    private int numberOfHalls;
    private boolean politicsAllowed;

    public PublicUniversity(String name, String address, int dateEstablished, int numberOfDepartments,
                            int numberOfHalls, boolean politicsAllowed) {
        super(name, address, dateEstablished, numberOfDepartments);
        this.numberOfHalls = numberOfHalls;
        this.politicsAllowed = politicsAllowed;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public void setNumberOfHalls(int numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }

    public void setPoliticsAllowed(boolean politicsAllowed) {
        this.politicsAllowed = politicsAllowed;
    }

    @Override
    public boolean isUgcApproved() {
        return false;
    }

    @Override
    public boolean isPoliticsAllowed() {
        return politicsAllowed;
    }

    @Override
    public String toString() {
        return "Public " + super.toString() + " [numberOfHalls=" + numberOfHalls + ", politicsAllowed=" + politicsAllowed + "]";
    }
}
