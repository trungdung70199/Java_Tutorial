import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int n;    
        Scanner number = new Scanner(System.in);
        System.out.println("Input number:");
        n = number.nextInt();
        
        if (n > 0 ) {
            System.out.println("i la so duong!");
        } else {
            System.out.println("i la so am!");
        }
    }
}
