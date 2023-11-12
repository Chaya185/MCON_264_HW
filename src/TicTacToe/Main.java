package TicTacToe;

public class Main {
    public static void main(String[] args){
        final int SIZE = 3; //sets the size of the tic tac toe board

        //creates a board object and resets it
        Board gameBoard = new ImplementBoard(SIZE);
        gameBoard.resetBoard();

        //creates 2 player objects: X and O
        Player X = new ImplementPlayer('X', gameBoard);
        Player O = new ImplementPlayer('O', gameBoard);

        //creates a scoreKeeper object to track the players score
        ScoreKeeper scores = new ImplementScoreKeeper(X, O);

        //creates a game object and starts the game
        Game initGame = new TicTacToeGame(X, O, gameBoard, SIZE, scores);
        initGame.startGame();
    }
}
