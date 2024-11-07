public class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void CollectFromGuesser() {
        Guesser gn = new Guesser();
        numFromGuesser = gn.takeNumberGuesser();
    }

    void CollectFromPlayer() {
        Player p1 = new Player();
        numFromPlayer1 = p1.takeNumberPlayer();

        Player p2 = new Player();
        numFromPlayer2 = p2.takeNumberPlayer();

        Player p3 = new Player();
        numFromPlayer3 = p3.takeNumberPlayer();
    }

    void compare() {

        if (numFromPlayer1 == numFromGuesser) {
            if (numFromPlayer2 == numFromGuesser && numFromPlayer3 == numFromGuesser) {
                System.out.println("All Player won the game");
            } else if (numFromPlayer2 == numFromGuesser) {
                System.out.println("Only Player1 and Player2 won the game.");
            } else if (numFromPlayer3 == numFromGuesser) {
                System.out.println("Only Player1 and Player3 won the game.");
            } else {
                System.out.println("Only Player1 won the game");
            }

        } else if (numFromPlayer2 == numFromGuesser) {
            if (numFromPlayer3 == numFromGuesser) {
                System.out.println("Only Player2 and Player3 wom the game.");
            } else {
                System.out.println("Only Player2 won the game.");
            }

        } else if (numFromPlayer3 == numFromGuesser) {
            System.out.println("Only Player3 won the game.");
        } else {
            System.out.println("NO Player won the game.");
        }
    }
}
