package calc2;
import java.util.Scanner;
public class en {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean end = true;
        do {
            System.out.println("Enter 1st number");
            double a = scan.nextDouble();
            System.out.println("Enter 2nd number");
            double b = scan.nextDouble();
            System.out.println("1.addition");
            System.out.println("2.subtraction");
            System.out.println("3.multiplication");
            System.out.println("4.division");
            System.out.println("5.exit");
            System.out.println("Enter the command");
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    double c = a + b;
                    System.out.println(c);
                    break;
                case 2:
                    double c1 = a - b;
                    System.out.println(c1);
                    break;
                case 3:
                    double c2 = a * b;
                    System.out.println(c2);
                    break;
                case 4:
                    if (b != 0) {
                        double c3 = a / b;
                        System.out.println(c3);
                        break;
                    } else {
                        System.out.println("Error! b = 0!");
                        break;
                    }
                case 5:
                    end = false;
                default:
            }
        }
        while (end);
    }
}
