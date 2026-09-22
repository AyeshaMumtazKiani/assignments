class Rectangle {

    int length;
    int width;

    void calculateArea() {
        System.out.println("Area: " + (length * width));
    }
    void calculatePerimeter() {
        System.out.println("Perimeter: " + (2 * (length + width)));
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.width = 5;
        System.out.println("Length: " + r1.length
                + "\nWidth: " + r1.width);
        r1.calculateArea();
        r1.calculatePerimeter();
    }
}
