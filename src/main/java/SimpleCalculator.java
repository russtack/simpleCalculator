
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        int sum = num + num1;
        int sub = num - num1;
        int mul = num * num1;
        double div = 1.0 * num / num1;
        System.out.println(num + " + " + num1 + " = " + sum);
        System.out.println(num + " - " + num1 + " = " + sub);
        System.out.println(num + " * " + num1 + " = " + mul);
        System.out.println(num+" / "+num1+" = "+div); 

//         8 + 2 = 10
// 8 - 2 = 6
// 8 * 2 = 16
// 8 / 2 = 4.0

    }
}
