// Packages and API
// Import a Class Scanner
import java.util.Scanner; // Scanner ~ input
// or import java.util*
// User Scanner class create an object of the class
class Packages {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = input.nextLine();
    System.out.println("Username is: " + userName);
  }
}