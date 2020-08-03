

public class Fan {
    final int slow = 1, medium = 2, fast = 3;
    int speeds = slow;
    boolean status = false;
    double radius = 5;
    String color = "blue";

    public Fan(int speeds, boolean status, double radius, String color){
        this.speeds = speeds;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    private int getSpeeds(){
        if (!status){
            return speeds;
        }else return 0;
    }
    private boolean getStatus(){
        return status;
    }
    private double getRadius(){
        return radius;
    }
    private String getColor(){
        return color;
    }
    public int setSpeed(int speed){
        this.speeds = speed;
        return this.speeds;
    }
    public boolean setStatus(boolean status){
        this.status = status;
        return this.status;
    }
    public String setColor(String color){
        this.color = color;
        return this.color;
    }
    public String toString(){
        return "speed: " + speeds + ", status: " + status +", radius: "+ radius +", color: "+ color;
    }
public static class Main{
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(2, false, 5, "blue");
        System.out.println(fan1.toString() + "\n" + fan2.toString());
    }
    }
}
