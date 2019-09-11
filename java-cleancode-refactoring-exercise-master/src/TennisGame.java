public class TennisGame {

    public static final int pointAdvantageToWin = 4;
    public static final int floorPoints = 3;

    public static String getScore(String nameFirstPlayer, String nameSecondPlayer, int scoreFirstPlayer, int scoreSecondPlayer) {
        String score = "";
        int tempScore =0;
        boolean isEqualPoint = scoreFirstPlayer == scoreSecondPlayer;
        if (isEqualPoint)
        {
            switch (scoreFirstPlayer)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else {

            boolean isAdvantage = scoreFirstPlayer >= pointAdvantageToWin || scoreSecondPlayer >= pointAdvantageToWin;
            if (isAdvantage)
            {
                int minusResult = scoreFirstPlayer - scoreSecondPlayer;
                int firstPointAdvantage = 1;
                boolean isAdvantageFirstPlayer =(minusResult == firstPointAdvantage);

                int secondPointAdvantage = -1;
                boolean isAdvantageSecondPlayer =(minusResult == secondPointAdvantage);

                int thirdPointAdvantage = 3;
                boolean isAdvantageWin =(minusResult == thirdPointAdvantage);
                if (isAdvantageFirstPlayer) score ="Advantage player1";
                else if (isAdvantageSecondPlayer) score ="Advantage player2";
                else if (isAdvantageWin) score = "Win for player1";
                else score ="Win for player2";
            }
            else
            {
                for (int i=1; i< floorPoints; i++)
                {
                    if (i==1) tempScore = scoreFirstPlayer;
                    else { score+="-"; tempScore = scoreSecondPlayer;}
                    switch(tempScore)
                    {
                        case 0:
                            score+="Love";
                            break;
                        case 1:
                            score+="Fifteen";
                            break;
                        case 2:
                            score+="Thirty";
                            break;
                        case 3:
                            score+="Forty";
                            break;

                    }
                }
            }
        }
        return score;
    }
}
