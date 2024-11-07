import java.util.Scanner;

public class Guesser {
    int GuesserNum;

    public int takeNumberGuesser() {
        System.out.println("Guesser guess a Number: ");
        Scanner sc = new Scanner(System.in);
        GuesserNum = sc.nextInt();

        return GuesserNum;
    }
}
