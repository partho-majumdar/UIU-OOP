package OOP_4_Pillars.Solution.Solution_01;

public abstract class University implements Comparable<University> {
    private String name;
    private String address;
    private int dateEstablished;
    private int numberOfDepartments;

    public abstract boolean isUgcApproved();

    public abstract boolean isPoliticsAllowed();


    public University(String name, String address, int dateEstablished, int numberOfDepartments) {
        this.name = name;
        this.address = address;
        this.dateEstablished = dateEstablished;
        this.numberOfDepartments = numberOfDepartments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDateEstablished() {
        return dateEstablished;
    }

    public void setDateEstablished(int dateEstablished) {
        this.dateEstablished = dateEstablished;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dateEstablished=" + dateEstablished +
                ", numberOfDepartments=" + numberOfDepartments +
                '}';
    }

    // ekhane "this" > "other" boro hole sort in ascending order
    @Override
    public int compareTo(University other) {
        if (this.dateEstablished < other.dateEstablished) {
            return 1;
        } else if (this.dateEstablished == other.dateEstablished) {
            return 0;
        } else {
            return -1;
        }
    }

    public String getUniversityType() {
        if (this instanceof PublicUniversity) {
            return "Public";
        } else if (this instanceof PrivateUniversity) {
            return "Private";
        } else {
            return "Unknown";
        }
    }
}
