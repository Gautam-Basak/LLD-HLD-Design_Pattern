package com.example.designpattern.DesignTicTacToe.model;

import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;

public class Board {
    
    public int size;
    public PlayingPiece [][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean isPieceAdded(int i, int j, PlayingPiece playingPiece){

        if(board[i][j] != null){
            return false;
        }
        board[i][j] = playingPiece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeCells(){

        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] == null){
                    Pair<Integer, Integer> rowCol = new Pair<>(i, j);
                    freeCells.add(rowCol);
                }
            }
        }
        return freeCells;
    }

    public void printBoard(){

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] != null){
                    System.out.print(board[i][j].getPieceType().name() + "   ");
                }else{
                    System.out.print("  ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
