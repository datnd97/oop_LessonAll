public class Point3D extends Point2D {
    private float z = 0.0f;
    Point3D() {
        super();
    }
    Point3D(float x,float y,float z) {
        super(x,y);
        this.z = z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setXYZ(float x,float y,float z) {
        super.setX(x)  ;
        super.setY(y);
        setZ(z);
    }
    public float[] getXYZ() {
       return new float[] {super.getX(),super.getY(), getX()};
    }
    public String toString() {
        return "3D: (" + super.getX() +","
                +super.getY()+","
                +getZ()+")";
    }

}
