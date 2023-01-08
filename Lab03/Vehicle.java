import java.util.Scanner;
class VehicleInfo{
    int no_of_seats;
    int no_of_wheels;
    void MyVehicle(int no_of_seats, int no_of_wheels){
        this.no_of_seats = no_of_seats;
        this.no_of_wheels = no_of_wheels;
    }
    void showVehicle(){
        if (no_of_seats==4 && no_of_wheels==4){
            System.out.println("You Have A Car which has " +no_of_seats+ " seats snd " + no_of_wheels+" wheels");
        }
        else if (no_of_seats==1 && no_of_wheels==2){
            System.out.println("You Have A Motorcycle which has " +no_of_seats+ " seats snd " + no_of_wheels+" wheels");
        }
    }

}
public class Vehicle {
    public static void main(String arg[]){
    Scanner user_input=new Scanner(System.in);
        int no_of_seats, no_of_wheels;
        System.out.println("Enter Number of Seats : ");
        no_of_seats=user_input.nextInt();
        System.out.println("Enter Number of  Wheels : ");
        no_of_wheels= user_input.nextInt();
    // Creating Motorcycle Object
        VehicleInfo Motorcycle=new VehicleInfo();
        Motorcycle.MyVehicle(no_of_seats, no_of_wheels);
        Motorcycle.showVehicle();
    // Creating Car Object
        VehicleInfo Car = new VehicleInfo();
        Car.MyVehicle(no_of_seats, no_of_wheels);
        Car.showVehicle();
    }
}

