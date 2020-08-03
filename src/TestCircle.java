public class TestCircle {
    private final String color = "red";

    public double getRadius(){
        return 1;
    }
    public double getArea(double r){
            return Math.PI * Math.pow(r, 2);
    }

    public static class Main{
        public static void main(String[] args) {
            TestCircle circle = new TestCircle();
            System.out.println("the circle has the radius is: " + circle.getRadius());
            System.out.println("the color of this circle is: " + circle.color);
            System.out.println("area of the circle is: " + circle.getArea(3));
        }
    }
}
