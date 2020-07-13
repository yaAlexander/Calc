import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);
        System.out.println("КОНСОЛЬНЫЙ КАЛЬКУЛЯТОР");
        System.out.println("Введите первое чило");
        double number1 = scanner.nextDouble();
        System.out.println("Введите знак арифметической операции +, -, *, или /");
        char sign = scanner.next().charAt(0);
        System.out.println("Введите второе чило");
        double number2 = scanner.nextDouble();
        double result = 0;
        switch (sign) {
            case '+':
                result = (double) calc.addition(number1, number2);
                break;
            case '-':
                result = (double) calc.subtraction(number1, number2);
                break;
            case '*':
                result = (double) calc.multiplication(number1, number2);
                break;
            case '/':
                result = (double) calc.division(number1, number2);
                break;
        }
        System.out.print("Результат выражения: ");
        System.out.print(number1 + " " + sign + " " + number2 + " " + '=' + " " + result);
    }
}
