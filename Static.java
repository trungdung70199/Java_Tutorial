// The differences between static and public methods
public class Static {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects ");
    }
    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    
    public static void main(String[] args) {
        myStaticMethod();

        // Create an object of Main
        Static myObj = new Static();
        // Call the public method on the object
        myObj.myPublicMethod();
    }
}
