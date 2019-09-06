public class Student8 {
     int rollno;
     String name;
    String college = "Back khoa";
    Student8(int r,String n,String college) {
        rollno = r;
        name = n;
        college = college;
    }
     void change() {
        college = "vn";

    }
    void display() {
        System.out.println(rollno +" "+name + " "+college);

    }

    public static void main(String[] args) {
        Student8 s1 = new Student8(111,"Hoang","CN");
        Student8 s2 = new Student8(222,"Thanh","CN");
        s1.display();
        s2.display();
    }
}
