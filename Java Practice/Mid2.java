class Numbers{
    static int a = 20;
    int b = 9;
    static {
        a = a+10;
    }
    public void displayNumbers(){
        System.out.println(a + "  " + b);
    }
    public void updateNumbers(){
        a = 40;
        b = 90;
    }
}
public class Mid2 {
    public static void main(String[] args) {
        Numbers numbers1 =  new Numbers();
        Numbers numbers2 = new Numbers();
        int a = 5;
        double b = 10;
        String c = "Hello OOP Students";
        // System.out.println(a+b+c);
        // System.out.println(c+a+b);
        // System.out.println(b+a+c);
        int x = 10;
        System.out.println(x);
        // numbers1.displayNumbers();
        // numbers2.displayNumbers();
        // numbers1.updateNumbers();
        // numbers1.displayNumbers();
        // numbers2.displayNumbers();
        // String str1 = "SIBAU";
        // String str2 = new String("SIBAU");
        // System.out.println(str1.equals(str2));
        // System.out.println(str1 == str2);

    }
    static{
        int x = 20;
        System.out.println(x + " ");
    }    
}
