// object is an intance of class
import java.util.Scanner;
class Game {
    int count = 0;
    Scanner user_input = new Scanner(System.in);
    void Questions() {
        char answer;
        String Q1 = "MS-Word is an example of _____\nA) An operating system	\nB) A processing device\nC) Application software	\nD) An input device";
        String Q2 = "Ctrl, Shift and Alt are called .......... keys.\nA) modifier	\nB) function\nC) alphanumeric	\nD) adjustment\n";
        String Q3 = "A computer cannot boot if it does not have the _____\nA) Compiler	\nB) Loader\nC) Operating system	\nD) Assembler\n";
        String Q4 = "________ is the process of dividing the disk into tracks and sectors\nA) Tracking	\nB) Formatting\nC) Crashing	\nD) Allotting\n";
        String Q5 = "Junk e-mail is also called ______\nA) Spam	\nB) Spoof\nC) Sniffer script	\nD) Spool\n";
        String Q6 = "Microsoft Office is an example of a\nA) Closed source software	\nB) Open source software\nC) Horizontal market software	\nD) vertical market software\n";
        String Q7 = "By default, your documents print in ________ mode\nA) Landscape	\nB) Portrait\nC) Page Setup	\nD) Print View\n";
        String Q8 = "_____are attempts by individuals to obtain confidential information from you by falsifying their identity\nA) Phishing trips	\nB) Computer viruses\nC) Phishing scams	\nD) Spyware scams\n";
        String Q9 = "Storage capacity of magnetic disk depends on\nA) disk pack in disk surface	\nB) tracks per inch of surface\nC) bits per inch of tracks	\nD) All of the above\n";
        String Q10 = "Several computers linked to a server to share programs and storage space________\nA) Network	\nB) GroupinC) Library	\nD) Integrated system\n";
        System.out.println(Q1);
        answer = user_input.next().charAt(0);
        if (answer == 'C' || answer == 'c') {
            count++;
        }
        System.out.println("Score: " + count);
        System.out.println(Q2);
        answer = user_input.next().charAt(0);
        if (answer == 'a' || answer == 'A') {
            count++;
        }
        System.out.println("Score: " + count);
        System.out.println(Q3);
        answer = user_input.next().charAt(0);
        if (answer == 'c' || answer == 'C') {
            count++;
        }
        System.out.println("Score: " + count);
        System.out.println(Q4);
        answer = user_input.next().charAt(0);
        if (answer == 'b' || answer == 'B') {
            count++;
        }
        System.out.println("Score: " + count);
        System.out.println(Q5);
        answer = user_input.next().charAt(0);
        if (answer == 'a' || answer == 'A') {
            count++;
        }
        System.out.println("Score: " + count);
        System.out.println(Q6);
        answer = user_input.next().charAt(0);
        if (answer == 'c' || answer == 'C') {
            count++;
        }
        System.out.println("Score: " + count);
        System.out.println(Q7);
        answer = user_input.next().charAt(0);
        if (answer == 'b' || answer == 'B') {
            count++;
        }
        System.out.println("Score: " + count);
        System.out.println(Q8);
        answer = user_input.next().charAt(0);
        if (answer == 'c' || answer == 'C') {
            count++;
        }
        System.out.println("Score: " + count);
        System.out.println(Q9);
        answer = user_input.next().charAt(0);
        if (answer == 'd' || answer == 'D') {
            count++;
        }
        System.out.println("Score: " + count);
        System.out.println(Q10);
        answer = user_input.next().charAt(0);
        if (answer == 'a' || answer == 'A') {
            count++;
        }
        System.out.println("Score: " + count);
    }
}

public class OOPSSirFaheemAssignment1 {
    public static void main(String arg[]) {
        Game p1 = new Game();
        p1.Questions();
    }
}
