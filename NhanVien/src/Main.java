public class Main {

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new TruongPhong();
        TruongPhong nv3 = new TruongPhong();
        TruongPhong nv4 = (TruongPhong) new NhanVien();

    }
}