public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b - 4 * a * c);
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        return -b + Math.sqrt(delta) / (2 * a);
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        return -b - Math.sqrt(delta) / (2 * a);
    }

    public double getRootEquals() {
        return (-b / (2 * a));
    }

    public String display() {
        double delta = getDiscriminant();
        String rs = "";
        if (delta > 0) {
            rs = "Ket qua la: x1: " + getRoot1() + " ,x2 = :" + getRoot2();
        } else if (delta == 0) {
            rs = "Co nghiem chung la: " + getRootEquals();
        } else {
            rs = "The equation has no roots";
        }
        return rs;

    }
}