import java.util.Scanner;

class Calculator {
    int Number1;
    int Number2;
    char Operator;

    Calculator() {
        System.out.println("==========================Without Parameters Constructor==================");
    }

    Calculator(int Number1, int Number2, char Operator) {
        this.Number1 = Number1;
        this.Number2 = Number2;
        this.Operator = Operator;
        System.out.println("==========================Using Constructor with Parameters==================");
        switch (Operator) {
            case '+':
                System.out.println("The sum of numbers is . " + (Number1 + Number2));
                break;
            case '-':
                System.out.println("The difference of numbers is . " + (Number1 - Number2));
                break;
            case '/':
                System.out.println("The Quotient of numbers is . " + (Number1 / Number2));
                break;
            case '%':
                System.out.println("The Mod of numbers is . " + (Number1 % Number2));
                break;
            case '*':
                System.out.println("The Product of numbers is . " + (Number1 * Number2));
                break;
        }
    }

    void setData(int Number1, int Number2, char Operator) {
        this.Number1 = Number1;
        this.Number2 = Number2;
        this.Operator = Operator;
    }

    void getData() {
        switch (Operator) {
            case '+':
                System.out.println("The sum of numbers is . " + (Number1 + Number2));
                break;
            case '-':
                System.out.println("The difference of numbers is . " + (Number1 - Number2));
                break;
            case '/':
                System.out.println("The Quotient of numbers is . " + (Number1 / Number2));
                break;
            case '%':
                System.out.println("The Mod of numbers is . " + (Number1 % Number2));
                break;
            case '*':
                System.out.println("The Product of numbers is . " + (Number1 * Number2));
                break;
        }
    }

}

public class CalcSecondAssignment {
    public static void main(String arg[]) {
        Scanner user_input = new Scanner(System.in);
        Calculator calculator1 = new Calculator();
        int Number1;
        int Number2;
        char Operator;
        System.out.print("Enter Number1 ---> ");
        Number1 = user_input.nextInt();
        System.out.print("Enter Number2 ---> ");
        Number2 = user_input.nextInt();
        System.out.print("Enter Operator ---> ");
        Operator = user_input.next().charAt(0);
        calculator1.setData(Number1, Number2, Operator);
        calculator1.getData();

        System.out.print("Enter Number1 ---> ");
        Number1 = user_input.nextInt();
        System.out.print("Enter Number2 ---> ");
        Number2 = user_input.nextInt();
        System.out.print("Enter Operator ---> ");
        Operator = user_input.next().charAt(0);
        Calculator calculator2 = new Calculator(Number1, Number2, Operator);
        System.out.println("==========================The End==================");

    }
}
