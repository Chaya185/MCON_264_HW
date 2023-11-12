package TicTacToe;

public interface Player {
    void makeMove();
    char getMark();
    boolean isValidMove(int row, int col);
}
