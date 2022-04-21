public class Main {/*Let's play! You have to return which player won! In case of a draw return Draw!.*/
    public class Kata {
        public static String rps(String p1, String p2) {
            if (p1 == p2) {
                return "Draw!";
            } else {
                String rules = "rockpaperscissorsrock";
                if (rules.contains(p1+p2)) {
                    return "Player 2 won!";
                } else {
                    return "Player 1 won!";
                }
            }
        }
    }
}
