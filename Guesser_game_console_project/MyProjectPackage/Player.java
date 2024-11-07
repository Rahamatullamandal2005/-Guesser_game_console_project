import java.util.Scanner;

public class Player {
    int playerNum;

    public int takeNumberPlayer() {
        System.out.println("Player guess a Number: ");
        Scanner sc = new Scanner(System.in);
        playerNum = sc.nextInt();

        return playerNum;
    }
}
