// Why there is a need of static: it will execute first in program and will destroy when program will end.
public class StaticBlockVarMeth {
    static int count = 0;
    static int Calculate(int val){
        return val * count;
    }
    public static void main(String[] args) {
        count = 10;
        System.out.println("Calling Calculate Method in Main Method. " + Calculate(10));
        System.out.println("Value of Static variable in Main after updating. " + count);
    }
    static {
        System.out.println("Hey this static Block And Calling Calculate Method in static block. " + Calculate(9));
    }
}
