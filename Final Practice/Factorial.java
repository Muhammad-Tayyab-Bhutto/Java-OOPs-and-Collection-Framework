public class Factorial {
    public static int Fect(int number){
        if (number == 0){
            return 1;
        }
        return number * Fect(number - 1);
    }
    public static void main(String[] args) {
        System.out.println(Fect(1));
    }
}
