
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("Where to? ");
        int end = Integer.parseInt(scanner.nextLine());
        System.out.println("Where from? ");
        for (int i = end; i <= start; i++) {
            System.out.println(i);
        }
    }
}
