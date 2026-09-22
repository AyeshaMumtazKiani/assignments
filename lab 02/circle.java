public class circle{
    double radius;

    public circle(){
        radius = 12;
    }
    public circle(double r) {
        radius = r;
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
}
class radius{
    public static void main(String[] args){
        circle c1 = new circle();
        circle c2 = new circle(5);

        System.out.println("Circumference of c1 is: " + c1.circumference());
        System.out.println("Circumference of c2 is: " + c2.circumference());

    }
}