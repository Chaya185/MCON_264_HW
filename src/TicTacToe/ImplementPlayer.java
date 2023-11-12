package TicTacToe;

import java.util.Scanner;

public class ImplementPlayer implements Player{
    private char mark;
    private Board board;

    //constructor that accepts mark X/O and the game board. It initializes the 2
    public ImplementPlayer(char mark, Board board){
        this.mark = mark;
        this.board = board;
    }

    //Asks the user where they want to place their mark and sets it for them
    @Override
    public void makeMove(){
        Scanner scanner = new Scanner(System.in);

        //gets the desired tile to place mark
        System.out.println("Player " + mark + "'s turn. Enter row and column (1-3):");
        int row = scanner.nextInt() - 1;
        int col = scanner.nextInt() - 1;

        if (isValidMove(row, col)) {
            board.setMark(row, col, mark); //call method to set mark on desired tile
        } else {
            System.out.println("Invalid move. Try again.");
            makeMove();
        }
    }

    //checks if move is valid-if tile is unoccupied
    @Override
    public boolean isValidMove(int row,int col){
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board.getSpecificValue(row, col) == '-';
    }

    //gets the mark of the player
    @Override
    public char getMark(){
        return mark;
    }
}
