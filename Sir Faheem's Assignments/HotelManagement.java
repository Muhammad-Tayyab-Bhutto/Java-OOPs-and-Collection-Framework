import java.util.Scanner;

class Hotel {
    int veters;
    int manegers;
    String vetersNames[] = new String[veters];
    String manegersNames[] = new String[manegers];
    double vs = 10000.0;
    double ms = 50000.0;

    void setData(int veters, int manegers, String manegersNames[], String vetersNames[]) {
        this.veters = veters;
        this.manegers = manegers;
        for (int i = 0; i < veters; i++){
            this.vetersNames[i] = vetersNames[i];
        }
        for (int i = 0; i < manegers; i++){
            manegersNames[i] = manegersNames[i];
        }
    }

    void Display() {
        for (int i = 0; i < veters; i++){
            System.out.print("Veters NAME : " + vetersNames[i] + vs);
        }
        for (int i = 0; i < manegers; i++){
            System.out.print("Veters NAME : " + manegersNames[i] + ms);
        }
    }

}

public class HotelManagement {
    public static void main(String a[]) {
        Scanner userInput = new Scanner(System.in);
        Hotel h1 = new Hotel();
        System.out.print("Veters : ");
        int veters = userInput.nextInt();
        System.out.print("MANEGERS : " );
        int manegers = userInput.nextInt();
        String vetersNames[] = new String[veters];
        String manegersNames[] = new String[manegers];
        userInput.nextLine();
        for (int i = 0; i < veters; i++) {
            System.out.println("Veters NAMES :");
            vetersNames[i] = userInput.nextLine();
        }
        for (int i = 0; i < manegers; i++) {
            System.out.println("Manegers NAME : ");
            manegersNames[i] = userInput.nextLine();
        }
        h1.setData(veters, manegers, manegersNames, vetersNames);
        h1.Display();
    }

}
