package TicTacToe;

public interface Game {

    void startGame();
    // Check if the game is over (either a winner or a draw)
    boolean isGameOver();
    boolean hasWinner();
    void playTurn(Player player);
    void endGame(Player currentPlayer);
}
