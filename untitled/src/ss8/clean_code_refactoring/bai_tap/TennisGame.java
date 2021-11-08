package ss8.clean_code_refactoring.bai_tap;

import org.jetbrains.annotations.NotNull;

public class TennisGame {
    public static final char NEGATIVE = '-';

    public static @NotNull
    String getScore(String player1Name, String player2Name, int nameScore1, int nameScore2) {
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (nameScore1 == nameScore2) {
            switch (nameScore1) {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;
                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else if (nameScore1 >= 4 || nameScore2 >= 4) {
            int minusResult = nameScore1 - nameScore2;
            if (minusResult == 1) score = new StringBuilder("Advantage player1");
            else if (minusResult == -1) score = new StringBuilder("Advantage player2");
            else if (minusResult >= 2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = nameScore1;
                else {
                    score.append(NEGATIVE);
                    tempScore = nameScore2;
                }
                switch (tempScore) {
                    case 0:
                        score.append("Love");
                        break;
                    case 1:
                        score.append("Fifteen");
                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    case 3:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }

}
