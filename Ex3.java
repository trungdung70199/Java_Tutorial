// Kiem tra 3 so co phai la 3 canh cua tam giac hay khong 
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        float a, b, c;
        System.out.println("Input numbers");
        Scanner number = new Scanner(System.in);

        a = number.nextInt();
        b = number.nextInt();
        c = number.nextInt();

        if (a+b>c && b+c>a && a+c>b) {
            System.out.println("a,b,c la 3 canh cua 1 tam giac");
        } else {
            System.out.println("a,b,c khong phai la 3 canh cua 1 tam giac");
        }
    }
}
