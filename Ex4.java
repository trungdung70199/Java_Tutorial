import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner number = new Scanner(System.in);
        System.out.println("Input number");

        a = number.nextInt();
        b = number.nextInt();
        c = number.nextInt();
        if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a) {
            System.out.println("a,b,c la 3 canh cua 1 tam giac");
        } else {
            System.out.println("a,b,c khong phai la 3 canh cua 1 tam giac");
        }
    }
}
