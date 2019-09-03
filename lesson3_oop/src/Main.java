public class Main {
    public static void main(String[] args) {
        QuadraticEquation  x1 = new QuadraticEquation(1,-5,4);
        double delta = x1.getDiscriminant();
        System.out.println(x1.display());

    }
}
