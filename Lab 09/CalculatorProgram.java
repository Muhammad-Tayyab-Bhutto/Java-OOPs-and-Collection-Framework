import java.util.Scanner;

class Calculator{
    double number, result = 0.0;
    char operator;

    double getResult(double number, char operator){
        this.number = number;
        this.operator = operator;
        if (operator == '+'){
            result += number;
            System.out.println("result + " + number + " = " + result);
            return result;
        }  else if (operator == '*'){
            result *= number;
            System.out.println("result * " + number + " = " + result);
            return result;
        }  else if (operator == '-'){
            result -= number;
            System.out.println("result - " + number + " = " + result);
            return result;
        }  else if (operator == '/'){
            result /= number;
            System.out.println("result / " + number + " = " + result);
            return result;
        }  else {
            return result;
        }
    }
}

public class CalculatorProgram{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        double number;
        char operator;
        operator = input.next().charAt(0);
        number = input.nextDouble();
        System.out.println("new result = "+calculator.getResult(number, operator));

        while(true){
            operator = input.next().charAt(0);
            if (operator == 'r' || operator == 'R'){
                System.out.println("Final result = " + calculator.getResult(number, operator));
                System.out.println("Again? (y/n)");
                operator = input.next().charAt(0);
                if (operator == 'y' || operator == 'y'){
                    calculator.result = 0.0;
                    System.out.println("result = " + calculator.result);
                    operator = input.next().charAt(0);
                    number = input.nextDouble();
                    System.out.println("new result = "+calculator.getResult(number, operator));
                }
                if (operator == 'n' || operator == 'N'){
                    break;
                }
            } else {
                number = input.nextDouble();
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/'){
                    System.out.println("updated result = "+calculator.getResult(number, operator));
                }  else {
                    System.out.println(operator + " is an unknown operation. \nReenter, your last line:");
                }
            }
        }
    }
}