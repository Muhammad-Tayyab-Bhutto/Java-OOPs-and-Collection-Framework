public class PrintTest {
    public static void methodOverloading(int a, char b){
    System.out.println("Integer is "+ a + " Character is "+b);
    }
    public static void methodOverloading(char a, int b){
    System.out.println("Character is "+ a + " Integer is "+b);    
    }
    public static void main(String[] arg){
        methodOverloading(45,'A');
        methodOverloading('A',45);
    }
}
