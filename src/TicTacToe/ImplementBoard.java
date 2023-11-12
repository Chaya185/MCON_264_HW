package TicTacToe;

public class ImplementBoard implements Board{
    private static char[][] board; //keeps track of the tic tac toe board for the game
    private int size; //holds the value of board size (length/width)

    //constructor accepts the size of the board and creates a tic tac toe board of that size
    public ImplementBoard(int SIZE){
        this.board = new char[SIZE][SIZE];
        this.size = SIZE;
    }

    // Place a mark on the board at the specified row and column
    public void setMark(int row, int col, char mark){
        board[row][col] = mark;
    }

    // Check if the board is full. Full board means it's a draw
    public boolean isBoardFull(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == '-'){
                    return false;
                }
            }
        }
        return true;
    }

    // Reset the game board to original format
    public void resetBoard(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }

    //returns a specific tile in the tic tac toe board based on the parameters of row and column numbers.
    @Override
    public char getSpecificValue(int row, int col) {
        return board[row][col];
    }

}
