public class TennisGame1 implements TennisGame {

    private int score1 = 0;
    private int score2 = 0;
    private final String player1Name;  // Immutable variable
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (this.player1Name.equals(playerName)) {
            score1 += 1;
        } else {
            score2 += 1;
        }
    }

    public String getScore() {
        String score = "";
        int tempScore;
        String[] scoreNames = {"Love", "Fifteen", "Thirty", "Forty"};

        if (score1 == score2) { // All + Deuce
            score = switch (score1) {
                case 0 -> scoreNames[0] + "-All";
                case 1 -> scoreNames[1] + "-All";
                case 2 -> scoreNames[2] + "-All";
                default -> "Deuce";
            };
        } else if (score1 >= 4 || score2 >= 4) { // Adv + Win
            int minusResult = score1 - score2;
            if (minusResult == 1) {
                score = "Advantage " + player1Name;
            } else if (minusResult == -1) {
                score = "Advantage " + player2Name;
            } else if (minusResult >= 2) {
                score = "Win for " + player1Name;
            } else {
                score = "Win for " + player2Name;
            }
        } else { // Normal game
            score = scoreNames[score1] + "-" + scoreNames[score2];
        }
        return score;
    }
}