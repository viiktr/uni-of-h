import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        System.out.println("First number?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int fnumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Last number?");
        int lnumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = fnumber; i <= lnumber; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
