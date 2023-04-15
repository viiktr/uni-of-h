
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
int count = 0;
while(true) {
    System.out.println("Give a number:");
    int number = Integer.parseInt(scanner.nextLine());
    if (number == 0) {
        break;
    } else if (number < 0) {
        count++;
    } else {
        // Do nothing
    }
}
System.out.println("Number of numbers: " + count);