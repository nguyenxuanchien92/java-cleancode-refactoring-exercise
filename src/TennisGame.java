public class TennisGame {

    public static final String ADDSCORE = "-";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";

    public static String getScore(String player1Name, String player2Name, int mScore1, int mScore2) {
        String score = "";
        int tempScore = 0;
        if (mScore1 == mScore2) {
            switch (mScore1) {
                case 0:
                    score = LOVE + "-All";
                    break;
                case 1:
                    score = FIFTEEN + "-All";
                    break;
                case 2:
                    score = THIRTY + "-All";
                    break;
                case 3:
                    score = FORTY + "-All";
                    break;
                default:
                    score = DEUCE;
                    break;
            }
        } else if (mScore1 >= 4 || mScore2 >= 4) {
            int minusResult = mScore1 - mScore2;
            if (minusResult == 1) score = ADVANTAGE_PLAYER_1;
            else if (minusResult == -1) score = ADVANTAGE_PLAYER_2;
            else if (minusResult >= 2) score = WIN_FOR_PLAYER_1;
            else score = WIN_FOR_PLAYER_2;
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = mScore1;
                else {
                    score += ADDSCORE;
                    tempScore = mScore2;
                }
                switch (tempScore) {
                    case 0:
                        score += LOVE;
                        break;
                    case 1:
                        score += FIFTEEN;
                        break;
                    case 2:
                        score += THIRTY;
                        break;
                    case 3:
                        score += FORTY;

                        break;
                }
            }
        }
        return score;
    }
}
