// Java Constructor
// A constructor in Java is a special method.
public class Constructor {
    int a;
    public Constructor() {
        a = 10;
    }
    public static void main(String[] args) {
        Constructor myObj = new Constructor();
        System.out.println(myObj.a);
    }
}
