// Access Methods with an object
// Create a AccessMethods class
public class AccessMethods {
    // Create a Throttle() method
    public void Throttle() {
        System.out.println("The car is going as fast as it can!");
        // Create a speed() method and add a parameter
        }
        // Create a speed() method and add a parameter
        public void speed(int maxSpeed) {
            System.out.println("Max speed is: " + maxSpeed);
        }
        // Inside AccessMethods call the methods on the myCar object 
        public static void main(String[] args) {
            AccessMethods myCar = new AccessMethods();
            // Create a myCar object
            myCar.Throttle();
            // Call the Throttle() method
            myCar.speed(200);
    }
}
