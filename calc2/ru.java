package calc2;
import java.util.Scanner;
public class ru {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                boolean end = true;
                do {
                    System.out.println("Введите 1-ое число");
                    double a = scan.nextDouble();
                    System.out.println("Введите 2-ое число:");
                    double b = scan.nextDouble();
                    System.out.println("1.Выполнить сложение.");
                    System.out.println("2.Выполнить вычитание.");
                    System.out.println("3.Выполнить умножение.");
                    System.out.println("4.Выполнить деление.");
                    System.out.println("5.Закрыть программу");
                    System.out.println("Введите команду:");
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
                                System.out.println("Ошибка! b = 0!");
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
