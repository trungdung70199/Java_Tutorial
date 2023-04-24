import java.util.Scanner;

class Packages {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            String userName;
            System.out.println("Enter username");
            userName = myObj.nextLine();
            System.out.println("Username is: " + userName);
        }
    }
}