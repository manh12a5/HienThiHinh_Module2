import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle ( botton-left)");
        System.out.println("3. Print the square triangle ( top-left)");
        System.out.println("4. Print isosceles triangle");
        System.out.println("5. Exit");
        System.out.print("Enter number: ");
        number = scanner.nextInt();

        switch (number) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    System.out.println("* * * * * *");
                }
                break;
            case 2:
                for (int i = 1; i <= 6; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
                for (int i = 6; i >= 1; i--) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 4:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5 - i; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 5:
                System.out.println("End");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
