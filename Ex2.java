import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Input Number:");
        input.nextInt();
        n = input.nextInt();
        switch (n) {
            case 0:
                System.out.println("one");
                break;
            case 1:
                System.out.println("two");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("Number is only 0-9");
                break;
        }
    }  
}