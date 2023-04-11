// Multiple Parameters
// Can have as many parameters
public class MultiParameters {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 10);
        myMethod("Anna", 20);
    }
}
