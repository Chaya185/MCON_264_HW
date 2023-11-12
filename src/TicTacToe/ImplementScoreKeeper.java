package TicTacToe;

public class ImplementScoreKeeper implements ScoreKeeper {
    int Xscore = 0;
    int Oscore = 0;
    Player playerX;
    Player playerO;

    //constructor receives both players and sets them to fields
    public ImplementScoreKeeper(Player playerX, Player playerO){
        this.playerX = playerX;
        this.playerO = playerO;
    }

    //receives the winner mark and increments scores appropriately
    @Override
    public void updateScore(char winnerMark){
        if (winnerMark == playerX.getMark()) {
            Xscore += 1;
        }
        else {
            Oscore += 1;
        }
    }

    //displays the scores
    @Override
    public void displayScore(){
        System.out.println("Player X scored " + Xscore);
        System.out.println("Player O scored " + Oscore);
    }

}
