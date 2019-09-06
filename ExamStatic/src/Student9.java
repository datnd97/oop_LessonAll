public class Student9 extends  Student {
    int rollno;
    String name;
//     String college = "BachKhoa";
    
     void change() {
         String college = super.college;
         this.college = "quoc gia";

    }
    Student9(int r,String n) {
        rollno = r;
        name = n;
    }
    void display() {
        System.out.println(rollno+ " " +name +" "+college);
    }

    public static void main(String[] args) {

        Student9 s1 = new Student9(111,"Hoang");
        Student9 s2 = new Student9(222,"Thanh");
        Student9 s3 = new Student9(333,"Nam");
        s1.change();
        s1.display();
        s2.display();
        s3.display();
    }
}
