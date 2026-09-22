class Distance {
    int feet;
    int inches;

    // No-argument constructor
    Distance() {
        feet = 0;
        inches = 0;
    }

    // Two-argument constructor
    Distance(int f, int i) {
        feet = f;
        inches = i;
    }

    // Display function
    void display() {
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}

class distanceRun{
    public static void main(String[] args) {

        Distance d1 = new Distance();
        Distance d2 = new Distance(5, 8);

        System.out.println("Distance 1:");
        d1.display();

        System.out.println("Distance 2:");
        d2.display();
    }
}