import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        String operator = scanner.next();
        double b = scanner.nextDouble();

        switch (operator) {
            case "+":
                System.out.println(Logic.add(a, b));
                break;
            case "-":
                System.out.println(Logic.sub(a, b));
                break;
            case "*":
                System.out.println(Logic.mul(a, b));
                break;
            case "/":
                System.out.println(Logic.div(a, b));
                break;
            case "%":
                System.out.println(Logic.modulo(a, b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

}