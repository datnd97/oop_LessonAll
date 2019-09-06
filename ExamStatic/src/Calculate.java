public class Calculate {
    static int cube(int x) {
        return x*x*x;
    }

    public static void main(String[] args) {
        int rs = Calculate.cube(4);
        System.out.println(rs);
        int rs2 = Calculate.cube(3);
        System.out.println(rs2);
    }
}
