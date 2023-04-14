// Multiple Objects
// Can create multiple objects of one class
public class MultiObject {
    int a = 10;
    public static void main(String[] args) {
        MultiObject myObj1 = new MultiObject();
        MultiObject myObj2 = new MultiObject();
        System.out.println(myObj1.a);
        System.out.println(myObj2.a);
    }
}
