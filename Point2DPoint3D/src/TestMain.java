public class TestMain {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(1,2);
        System.out.println(point2D);
        Point2D point = new Point2D(1,2);
        System.out.println(point);

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        Point3D point3D1 = new Point3D(1,2,3);
        System.out.println(point3D1);
        float []test = point3D1.getXYZ();
        for(int i =0;i < test.length;i++) {
            System.out.println(test[i]);
        }
    }
}
