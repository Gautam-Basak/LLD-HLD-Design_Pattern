package com.example.designpattern.DesignTicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.example.designpattern.DesignTicTacToe.model.Board;
import com.example.designpattern.DesignTicTacToe.model.PieceType;
import com.example.designpattern.DesignTicTacToe.model.Player;
import com.example.designpattern.DesignTicTacToe.model.PlayingPieceO;
import com.example.designpattern.DesignTicTacToe.model.PlayingPieceX;

import javafx.util.Pair;

public class TicTacToeGame {

     Deque<Player> players;
     Board boardGame;

    public TicTacToeGame() {
        initializeGame();
    }

    public void initializeGame() {

        // creating 2 Players
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);

        PlayingPieceO noughtPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", noughtPiece);

        players.add(player1);
        players.add(player2);

        // initializeBoard
        boardGame = new Board(3);
    }

    public String startGame() {

        boolean noWinner = true;

        while ((noWinner)) {

            // take out the player whose turn is and also put the player in the list back
            Player playerTurn = players.removeFirst();

            // get the free space from the board
            boardGame.printBoard();
            List<Pair<Integer, Integer>> freeSpace = boardGame.getFreeCells();
            if (freeSpace.isEmpty()) {
                noWinner = false;
                continue;
            }

            // read the user input
            System.out.print("Player: " + playerTurn.getName() + "Enter Row, Column: ");
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            // place the piece
            boolean pieceAddedSuccessfully = boardGame.isPieceAdded(inputRow, inputColumn, playerTurn.getPlayingPiece());
            if (!pieceAddedSuccessfully) {
                // player can not insert the piece into this cell, player has to choose another
                // cell
                System.out.print("Incorredt possition chosen, try again");
                //Add the removed player at the first as he will retry
                players.addFirst(playerTurn);
                continue;
            }
            // Else if successfully added we the add the player at the last
            players.addLast(playerTurn);

            // Here we will check row, column, diagonal and antidiagonal
            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.getPlayingPiece().getPieceType());
            if(winner){
                return playerTurn.getName();
            }
        }
        return "tie";
    }

    private boolean isThereWinner(int row, int col, PieceType pieceType) {
        
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int j = 0; j < boardGame.size; j++){
            if(boardGame.board[row][j] == null || boardGame.board[row][j].getPieceType() != pieceType){
                rowMatch = false;
            }
        }
        for(int i = 0; i < boardGame.size; i++){
            if(boardGame.board[i][col] == null || boardGame.board[i][col].getPieceType() != pieceType){
                columnMatch = false;
            }
        }
        for(int i = 0, j = 0; i < boardGame.size; i++, j++){
            if(boardGame.board[i][j] == null || boardGame.board[i][j].getPieceType() != pieceType){
                diagonalMatch = false;
            }  
        }
        for(int i = 0, j = boardGame.size - 1; i < boardGame.size; i++, j--){
            if(boardGame.board[i][j] == null || boardGame.board[i][j].getPieceType() != pieceType){
                antiDiagonalMatch = false;
            }  
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
