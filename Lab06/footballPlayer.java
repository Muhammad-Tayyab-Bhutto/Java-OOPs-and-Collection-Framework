import java.util.Scanner;

abstract class Player
{
    String name;
    abstract void setName(String str);
    String getName()
    {
        return name;
    }
}
public class footballPlayer extends Player {
    void setName(String name){
        super.name = name;
    }
    public static void main(String[] args) {
        // Player player = new Player();        // This will give an error because we can not create instance of abstract class
        footballPlayer football_player = new footballPlayer();
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        football_player.setName(name);
        System.out.println("Football player name is: " + football_player.getName());        
    }
}
