public class Fan {
    final int SLOW = 1, MEDIUM = 2,FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed,double radius,String color,boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public Fan() {

    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {

        if(on) {
            return "Fan is on and speed: "+speed+" radius: "+ radius +" color: "+color+" isOn: "+on ;
        }
        return "Fan is off and speed: "+speed+" radius: "+ radius +" color: "+color+" isOn: "+on;
    }
}
