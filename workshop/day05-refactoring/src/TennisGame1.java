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

        if (isAll()) {
            return scoreNames[score1] + "-All";
        }

        if (IsDeuce()) {
            return  "Deuce";
        }

        if ((score1 >= 4 || score2 >= 4) &&
                (Math.abs(score1 - score2) == 1)) { // Adv
            int minusResult = score1 - score2;
            if (minusResult == 1) {
                score = "Advantage " + player1Name;
            } else if (minusResult == -1) {
                score = "Advantage " + player2Name;
            }
        }

        if (score1 >= 4 || score2 >= 4) { // Win
            int minusResult = score1 - score2;
            if (minusResult >= 2) {
                score = "Win for " + player1Name;
            } else if (minusResult <= -2) {
                score = "Win for " + player2Name;
            }
        }

        else { // Normal game
            score = scoreNames[score1] + "-" + scoreNames[score2];
        }
        return score;
    }

    private boolean isAll() {
        return score1 == score2 && score1 <= 2;
    }

    private boolean IsDeuce() {
        return score1 == score2 && score1 > 2;
    }
}