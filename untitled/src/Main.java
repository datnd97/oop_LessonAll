public class Main {
    public static void main(String[] args) {
        String str = "Hello world";
        char charStr   = 'e';
        int count =0;
        for(int i = 0 ;i < str.length();i++) {
            if(str.charAt(i) == charStr) {
                count++;
            }
        }
        System.out.println("Count la: " + count);
    }
}
