package two;
import java.util.Scanner;
public class Simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int b = 2;
        while (number != 1) {
            if (number % b == 0) {
                System.out.print(b + " ");
                number /= b;
            } else if (b == 2) {
                b++;
            } else {
                b += 2;
            }
        }
    }
}
