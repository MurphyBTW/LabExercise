import java.util.Scanner;
public class LabExer1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers.");
        System.out.print("First number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Second number: ");
        double num2 = scanner.nextDouble();

        plusFive(num1, num2);
        timesTwo(num1, num2);
        showSquared(num1, num2);
        computePercent(num1, num2);
    }

    public static void plusFive(double a, double b) {
        System.out.println((a + 5) + " and " + (b + 5));
    }

    public static void timesTwo(double a, double b) {
        System.out.println((a * 2) + " and " + (b * 2));
    }

    public static void showSquared(double a, double b) {
        System.out.println((a * a) + " and " + (b * b));
    }

    public static void computePercent(double a, double b) {
        double percent = (a / b) * 100;
        System.out.println(a + " is " + percent + " percent of " + b);
    }
}