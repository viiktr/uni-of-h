import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        int number = (number1 + number2)*(number1 + number2);
        double squareRoot = Math.sqrt(number);
        System.out.println(squareRoot);
    }
}