public class MyListTest {
    public static void main(String[] args) throws IndexOutOfBoundsException{
        MyList<Integer> listInteger = new MyList<Integer>();


            listInteger.add(1);
            listInteger.add(2);
            listInteger.add(3);
//            listInteger.add(4);
//            listInteger.get(6);

            System.out.println("Element 1: "+listInteger.get(1));
            System.out.println("Element 2: "+listInteger.get(2));
//            System.out.println("Element 6: "+listInteger.get(3));
//            System.out.println("Element 4: "+listInteger.get(4));
//            System.out.println("Element 6: "+listInteger.get(6));
            listInteger.get(-1);
            System.out.println("element -1: "+ listInteger.get(-1));
        }


    }

