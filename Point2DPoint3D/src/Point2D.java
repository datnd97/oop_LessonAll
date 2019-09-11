public class Point2D {
    private float  x = 0.0f;
    private float y =  0.0f;

    Point2D () {

    }
    Point2D(float x,float y) {
        this.x = x;
        this.y = y;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getX() {
        return x;
    }
    public void setY(float y) {
        this.y = y;

    }
    public float getY() {
        return y;
    }
    public void setXY (float x,float y) {
        this.x = x;
        this.y = y;
    }
    public float []getXY() {
        float []xy = new float[2];
        xy[0] = getX();
        xy[1] = getY();
        return xy;
    }

    @Override
    public String toString() {
        return "("+x+")" +"("+y+")";
    }
}
