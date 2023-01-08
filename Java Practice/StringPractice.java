import java.lang.String;
public class StringPractice {
    public static void main(String s[]){
        String firstname=" Muhammad tayyab";
        String number1 = "89";
        int number = 89;
        String secondname="bhotto";
        String gmail = "muhammadtayyab@bscsf21@gmail@com";
        String[] str = gmail.split("@", 2);
        int number2 = Integer.parseInt(number1); 
        Integer number3 = 90;
        System.out.println(firstname.concat(" "+secondname));
        System.out.println(firstname.trim());
        System.out.println(firstname.contains(" Muhammad tayyab"));
        System.out.println(firstname.contains(" Muhammad tayyab"));
        System.out.println(firstname.replaceAll("a", "b"));
        System.out.println(firstname.equals(" Muhammad tayyab"));
        System.out.println(firstname.indexOf("tayyab"));
        for (String i : str){
            System.out.print(i);
        }
        System.out.println(number3.toString());
        System.out.println(firstname.startsWith(" "));
    }
}
