package TicTacToe;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicTacToeGame implements Game{
    private static Queue<Player> turnQueue; //queue that keeps track of players turns
    private Board board;
    private Player playerX;
    private Player playerO;
    private int size;
    private ScoreKeeper scores;

    //constructor accepts 2 players, board and board size and sets it to the fields
    public TicTacToeGame(Player playerX, Player playerO, Board board, int size, ScoreKeeper scores){
        this.turnQueue = new LinkedList<>();
        this.playerX = playerX;
        this.playerO = playerO;
        this.board = board;
        this.size = size;
        this.scores = scores;
    }

    //starts and handles the tic tac toe game
    @Override
    public void startGame(){
        Scanner scanner = new Scanner(System.in);

        // Implement the game initialization here
        System.out.println("Let's begin playing Tic Tac Toe!\n");
        //scanner.nextLine(); // This line will wait until the Enter key is pressed.

        //add both players to player queue
        turnQueue.add(playerX);
        turnQueue.add(playerO);

        //just an initialization for current player and
        Player currentPlayer = turnQueue.peek();
        boolean playAgain = true;

        while (playAgain) {
            //while loop to take turns playing until the game is full or there is a winner
            while (!isGameOver()) {
                currentPlayer = turnQueue.poll(); //get the next player in the queue to be current player
                turnQueue.add(currentPlayer); //add that player to the end of the queue for its next turn

                // Display current player's turn
                System.out.println(currentPlayer.getMark() + "'s turn");

                //display current board so that user can decide where to place mark
                System.out.println("Current Board:");
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print(board.getSpecificValue(i, j) + " ");
                    }
                    System.out.println();
                }

                // Player takes a turn
                playTurn(currentPlayer);
            }

            endGame(currentPlayer);

            //asks the user if they want to play again
            System.out.println("Do you want to play again? (y/n)");
            char choice = scanner.next().charAt(0);

            if (choice != 'y') {
                playAgain = false;
                scores.displayScore(); //display final score
            } else {
                board.resetBoard(); //resets the board if they want to play again
            }
        }
    }

    //calls the makeMove method of the current player to make a move
    @Override
    public void playTurn(Player currentPlayer){
        currentPlayer.makeMove();
    }

    //checks if the game is over based on 2 possibilities
    @Override
    public boolean isGameOver(){
        return hasWinner() || board.isBoardFull();
    }

    //checks if there is a winner on the board-3 marks in a row
    @Override
    public boolean hasWinner(){
        //check rows for winner
        for (int i = 0; i < size; i++) {
            if (board.getSpecificValue(i, 0) != '-' && board.getSpecificValue(i, 0)  == board.getSpecificValue(i, 1)
                    && board.getSpecificValue(i, 1)  == board.getSpecificValue(i, 2)) {
                return true;
            }
        }
        //check columns for winner
        for (int i = 0; i < size; i++) {
            if (board.getSpecificValue(0, i) != '-' && board.getSpecificValue(0, i) == board.getSpecificValue(1, i)
                    && board.getSpecificValue(1, i) == board.getSpecificValue(2, i)) {
                return true;
            }
        }
        //check diagonals for winner and return false if not found
        return (board.getSpecificValue(0, 0) != '-' && board.getSpecificValue(0, 0) == board.getSpecificValue(1, 1)
                && board.getSpecificValue(1, 1) == board.getSpecificValue(2, 2)) ||
                (board.getSpecificValue(0, 2) != '-' && board.getSpecificValue(0, 2) == board.getSpecificValue(1, 1)
                        && board.getSpecificValue(1, 1) == board.getSpecificValue(2, 0));
    }

    //handle game ending. Displays winner/draw and tracks score
    @Override
    public void endGame(Player currentPayer){
        System.out.println("Game over!");
        if (hasWinner()){
            System.out.println("\nPlayer " + currentPayer.getMark() + " wins!");
            scores.updateScore(currentPayer.getMark()); //increments the score
        }
        else {
            System.out.println("\nIt's a draw");
        }
        scores.displayScore(); //display the scores
    }
}
