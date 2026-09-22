class Car {

    String brand;
    String model;
    String color;
    int year;

    void start() {
        System.out.println("Car is starting");
    }

    void stop() {
        System.out.println("Car is stopping");
    }

    void drive() {
        System.out.println("Car is driving");
    }

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.brand = "Toyota";
        c1.model = "Corolla";
        c1.color = "White";
        c1.year = 2022;

        System.out.println("Brand: " + c1.brand
                + "\nModel: " + c1.model
                + "\nColor: " + c1.color
                + "Year: " + c1.year);
        c1.start();
        c1.drive();
        c1.stop();
    }
}
