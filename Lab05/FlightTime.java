class Flight{
    String id;
    String destination;
    Time arrivalTime;
    Time departTime;
    Passenger passengers;
    int count = 0;
    Flight(String id, String destination, Time arrivalTime, Time departTime){
        this.arrivalTime = arrivalTime;
        this.departTime = departTime;
        this.id = id;
        this.destination = destination;

    }
    Passenger addPassenger(Passenger passenger){
        count++;
        return passenger;
    }
    void printInfo(){
        System.out.println("Flight number " + id);
        System.out.println("Destination " + destination);
        System.out.println("Arrival Time" + arrivalTime);
        System.out.println("Depart Time" + departTime);
        System.out.println("Number of passenger " + count);
    }
}
class Time {
    private int hour;
    private int minutes;
    Time (int hour, int minutes){
        this.hour = hour;
        this.minutes = minutes;    
    }
    int getHour(){
        return this.hour;
    }
    int getMinutes(){
        return this.minutes;
    }

}
class Passenger {
    private String name;
    private int age;
    Passenger(String name, int age){
        this.name = name;
        this.age = age;
    }

}
public class FlightTime {
    public static void main(String arg[]){
        Time dep=new Time (8,10); 
        Time arr=new Time (9,00); 
        Flight f = new Flight("PK-303","Lahore",dep,arr); 
        Passenger psg1= new Passenger("Aariz", 30);  	
        Passenger psg2= new Passenger("Arsham", 44);  	
        f.addPassenger(psg1); 
        f.addPassenger(psg2); 
        f.printInfo(); 
    }
}
