import java.util.Scanner;

class Bank{
    int accountNumber;
    String name;
    void displayData(){
        System.out.println("Bhai ap ki data y hy. "+ accountNumber +"\n"+ name);
    }
}
class JavaBasics {
    public static void main(String a[]){
        Scanner userInput = new Scanner(System.in);   
        // // System.out.print("Bhai Number input dy. ");
        // // int number = userInput.nextInt();
        // // System.out.println("Bhai Ap ny y number dia tha. "+ number);
        // int[] arr = new int[3];
        // for (int i = 0; i < arr.length; i++){
        //     System.out.print("Bhai number input dy. ");
        //     arr[i] = userInput.nextInt();
        // }
        // for (int i : arr){
        //     System.out.println("Bhai ap ny y numbers diye the. "+ i);
        // }

        Bank bank = new Bank();
        bank.accountNumber = userInput.nextInt();
        userInput.nextLine();
        // char ch = userInput.next().charAt(0);
        bank.name = userInput.nextLine();
        bank.displayData();
    }    
}
