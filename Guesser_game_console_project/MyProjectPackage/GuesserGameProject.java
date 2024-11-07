public class GuesserGameProject {
    public static void main(String[] args) {
        Umpire u = new Umpire();

        u.CollectFromGuesser();
        u.CollectFromPlayer();
        u.compare();

    }
}
