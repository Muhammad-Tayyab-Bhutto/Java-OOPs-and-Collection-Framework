// Exception Handling: which interupts normal flow of program.
public class Exception_Handling{
    public static void main(String[] args) {
        // int number = Integer.parseInt("string into into integer");      // Not Possible it will shows       NumberFormatException.
        int number2 = Integer.parseInt("456464");    // It's possible
        // Handling NumberFormatException
        try{
            // int number3 = Integer.parseInt("Hello");
            int number4 = Integer.parseInt("456464"); 
        }
        catch(NumberFormatException nbe){
            System.out.println("Hey dude we are unable to parse it into a String.");
        }
        // Finallay block execute weather the exception is or not
        finally{
            System.out.println("Hey We are in finally block.");
        } 
        // System.out.println(number);
    }
}