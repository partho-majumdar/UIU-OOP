package Class_Object.Solution;

public class Q11 {
    public static void main(String[] args) {
        AddDistance distance1 = new AddDistance(5, 8);
        AddDistance distance2 = new AddDistance(3, 10);

        AddDistance sum = distance1.add(distance2);
        sum.displayDistance();
    }
}

class AddDistance {
    int feet;
    int inches;

    AddDistance(int f, int i) {
        this.feet = f;
        this.inches = i;
    }

    AddDistance add(AddDistance other) {
        int totalFeet = this.feet + other.feet;
        int totalInches = this.inches + other.inches;

        if (totalInches >= 12) {
            totalFeet += totalInches / 12;
            totalInches = totalInches % 12;
        }
        return new AddDistance(totalFeet, totalInches);
    }

    void displayDistance() {
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }
}

//Add two distances in inch-feet by creating a class named 'AddDistance'. --> 1 feet = 12 inches
