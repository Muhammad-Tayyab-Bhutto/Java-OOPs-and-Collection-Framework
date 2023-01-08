public class Recursion1 {
    static int Sum(int number){
        if (number == 1){
            return 1;
        }
        else {
            return number + Sum(number - 1);
        }
    }
    public static void main(String arg[]){
        System.out.println(Sum (5));
    }
}
