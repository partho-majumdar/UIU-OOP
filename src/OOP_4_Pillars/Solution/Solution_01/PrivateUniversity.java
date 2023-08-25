package OOP_4_Pillars.Solution.Solution_01;

public class PrivateUniversity extends University {
    private boolean ugcApproved;
    private boolean politicsAllowed;
    private int numberOfTrusteeMembers;

    public PrivateUniversity(String name, String address, int dateEstablished, int numberOfDepartments,
                             boolean ugcApproved, int numberOfTrusteeMembers) {
        super(name, address, dateEstablished, numberOfDepartments);
        this.ugcApproved = ugcApproved;
        this.numberOfTrusteeMembers = numberOfTrusteeMembers;
    }

    public boolean getUgcApproved() {
        return ugcApproved;
    }

    public void setUgcApproved(boolean ugcApproved) {
        this.ugcApproved = ugcApproved;
    }

    public boolean getPoliticsAllowed() {
        return politicsAllowed;
    }

    public void setPoliticsAllowed(boolean politicsAllowed) {
        this.politicsAllowed = politicsAllowed;
    }

    public int getNumberOfTrusteeMembers() {
        return numberOfTrusteeMembers;
    }

    public void setNumberOfTrusteeMembers(int numberOfTrusteeMembers) {
        this.numberOfTrusteeMembers = numberOfTrusteeMembers;
    }

    @Override
    public boolean isUgcApproved() {
        return getUgcApproved();
    }

    @Override
    public boolean isPoliticsAllowed() {
        return false;
    }

    @Override
    public String toString() {
        return "Private " + super.toString() + " [ugcApproved=" + ugcApproved + ", numberOfTrusteeMembers=" + numberOfTrusteeMembers + "]";
    }
}
