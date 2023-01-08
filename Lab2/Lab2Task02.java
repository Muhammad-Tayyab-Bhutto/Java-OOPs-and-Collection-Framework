import java.util.Scanner;
class Lab2Task02{
	public static void main(String arg[]){
		Scanner user_input = new Scanner(System.in);
		String str = "This is Muhammad Tayyab";
		/*for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == ' '){
				System.out.print(str.charAt(i));
			}
		}*/
		Character c = user_input.next().Character(0);
		System.out.print(c);
	}
}