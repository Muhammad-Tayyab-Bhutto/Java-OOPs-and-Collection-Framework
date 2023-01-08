import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CodeChefHoliday {


    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
		int t = user_input.nextInt();
		while (t-->0){
            int x1 = user_input.nextInt();
            List<Integer> festivals = new ArrayList<>();
			for (int i = 0; i < x1; i++){
                int value = user_input.nextInt();
                festivals.add(value);
            }
            checkHolidays(festivals);   
        }
	}

    public static void checkHolidays(List<Integer> festivals){
        int holidays = 0;
        List<Integer> satSun = new ArrayList<>();
        for(int i = 5; i <= 30; i += 5){
            int sat = ++i;
            int sun = ++i;

            satSun.add(sat);
            satSun.add(sun);
            holidays += 2;
        }

        for(int i = 0; i < festivals.size(); i++){
            if(!satSun.contains(festivals.get(i))){
                holidays++;
            }
        }
        System.out.println(holidays);
    }
}
