package TicTacToe;

public interface Board {
    // Place a mark on the board at the specified row and column
    void setMark(int row, int col, char mark);

    // Check if the board is full, resulting in a draw
    boolean isBoardFull();

    // Reset the game board
    void resetBoard();
    char getSpecificValue(int row, int col);
}
