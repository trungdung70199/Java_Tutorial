import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Nhap mot tu bat ky: ");
    String chuoi_ky_tu = input.nextLine();
    System.out.println(chuoi_ky_tu);
    input.close();
  }
}