package Lab04.ClassObjectBasic.IcecreamProject.src1;

public class Icecream {
    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;

    public Icecream() {

    }

    public Icecream(String icecreamType1, String icecreamCompany1, double icecreamPrice1) {
        this.icecreamType = icecreamType1;
        this.icecreamCompany = icecreamCompany1;
        this.icecreamPrice = icecreamPrice1;
    }

    public void setIcecreamType(String icecreamType1) {
        this.icecreamType = icecreamType1;
    }

    public void setIcecreamCompany(String icecreamCompany1) {
        this.icecreamCompany = icecreamCompany1;
    }

    public void setIcecreamPrice(double icecreamPrice1) {
        this.icecreamPrice = icecreamPrice1;
    }

    public String getIcecreamType() {
        return this.icecreamType;
    }

    public String getIcecreamCompany() {
        return this.icecreamCompany;
    }

    public double getIcecreamPrice() {
        return this.icecreamPrice;
    }

    public String toString() {
        return this.icecreamType + " " + this.icecreamCompany + " " + this.icecreamPrice;
    }

    public boolean equals(Icecream other) {
        if (this.icecreamType.equals(other.icecreamType)
                && this.icecreamCompany.equals(other.icecreamCompany)
                && this.icecreamPrice == other.icecreamPrice) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Icecream other) {
        if (this.icecreamPrice > other.icecreamPrice) {
            return 1;
        } else if (this.icecreamPrice == other.icecreamPrice) {
            return 0;
        } else {
            return -1;
        }
    }
}
