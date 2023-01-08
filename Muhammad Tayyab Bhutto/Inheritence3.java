import java.util.Scanner;

class Vehicle{
    static Scanner input = new Scanner(System.in);
    int manufactId;
    String brand;
    String address;
    void setData(int manufactId, String brand, String address){
        this.manufactId = manufactId;
        this.brand = brand;
        this.address = address;
    }
    void displayData(){
        System.out.println("Manufacturing id. " + manufactId);
        System.out.println("Brand " + brand);
        System.out.println("address" + address);
    }
    void getData(){
        System.out.print("Enter Manufacturing ID " + manufactId);
        manufactId = input.nextInt();
        input.nextLine();
        System.out.print("Enter Brand ");
        brand = input.nextLine();
        System.out.print("Enter Address. ");
        address = input.nextLine();
    }
}
class Car extends Vehicle{
    int carId;
    String carColor;
    String carModel;
    float carPrice;
    void setData(int carId, String carColor, String carModel, float carPrice){
        super.setData(4, "Tesla", "USA Washington");
        this.carId = carId;
        this.carColor = carColor;
        this.carModel = carModel;
        this.carPrice = carPrice;
    }
    void displayData(){
        super.displayData();
        System.out.println("Car id " + carId);
        System.out.println("Car Color " + carColor);
        System.out.println("Car Model " + carModel);
        System.out.println("Car Price " + carPrice);
    }

    void getData(){
        super.getData();
        System.out.print("Enter Car Id. ");
        carId = input.nextInt();
        input.nextLine();
        System.out.print("Enter Car Color. ");
        carColor = input.nextLine();
        System.out.print("Enter Car Model. ");
        carModel = input.nextLine();
        System.out.print("Enter Car Price. ");
        carPrice = input.nextFloat();
    }
}

class Truck extends Vehicle{
    int truckId;
    String truckColor;
    String truckModel;
    float truckPrice;
    void setData(int truckId, String truckColor, String truckModel, float truckPrice){
        super.setData(8, "Toyota", "XYS");
        this.truckId = truckId;
        this.truckColor = truckColor;
        this.truckModel = truckModel;
        this.truckPrice = truckPrice;
    }
    void displayData(){
        super.displayData();
        System.out.println("Truck id " + truckId);
        System.out.println("Truck Color " + truckColor);
        System.out.println("Truck Model " + truckModel);
        System.out.println("Truck Price " + truckPrice);
    }

    void getData(){
        super.getData();
        System.out.print("Enter Truck Id. ");
        truckId = input.nextInt();
        input.nextLine();
        System.out.print("Enter Truck Color. ");
        truckColor = input.nextLine();
        System.out.print("Enter Truck Model. ");
        truckModel = input.nextLine();
        System.out.print("Enter Truck Price. ");
        truckPrice = input.nextFloat();
    }
}

class Bus extends Vehicle{
    int busId;
    String busColor;
    String busModel;
    float busPrice;
    void setData(int busId, String busColor, String busModel, float busPrice){
        super.setData(8, "Toyota", "ACS");
        this.busId = busId;
        this.busColor = busColor;
        this.busModel = busModel;
        this.busPrice = busPrice;
    }
    void displayData(){
        super.displayData();
        System.out.println("Bus id " + busId);
        System.out.println("Bus Color " + busColor);
        System.out.println("Bus Model " + busModel);
        System.out.println("Bus Price " + busPrice);
    }

    void getData(){
        super.getData();
        System.out.print("Enter Bus Id. ");
        busId = input.nextInt();
        input.nextLine();
        System.out.print("Enter Bus Color. ");
        busColor = input.nextLine();
        System.out.print("Enter Bus Model. ");
        busModel = input.nextLine();
        System.out.print("Enter Bus Price. ");
        busPrice = input.nextFloat();
    }
}
public class Inheritence3 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Truck truck = new Truck();
        Bus bus = new Bus();
        car.setData(185, "Black", "Audi A3", 8000);
        truck.setData(185, "Black", "Audi A3", 8000);
        bus.setData(185, "Black", "Audi A3", 8000);
        car.displayData();
        truck.displayData();
        bus.displayData();
        bus.getData();
    }
}
