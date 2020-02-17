package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        StringBuilder returnString = new StringBuilder();
        if(handSign.toLowerCase().equals("rock")){
            returnString.append("paper");
        }else if(handSign.toLowerCase().equals("paper")){
            returnString.append("scissor");
        }else if(handSign.toLowerCase().equals("scissor")){
            returnString.append("rock");
        }
        return returnString.toString();
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        StringBuilder returnString = new StringBuilder();
        if(handSign.toLowerCase().equals("rock")){
            returnString.append("scissor");
        }else if(handSign.toLowerCase().equals("paper")){
            returnString.append("rock");
        }else if(handSign.toLowerCase().equals("scissor")){
            returnString.append("paper");
        }
        return returnString.toString();
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if(getWinningMove(handSignOfPlayer2).equals(handSignOfPlayer1)) {
            return handSignOfPlayer1;
        }
        return handSignOfPlayer2;
    }
}
