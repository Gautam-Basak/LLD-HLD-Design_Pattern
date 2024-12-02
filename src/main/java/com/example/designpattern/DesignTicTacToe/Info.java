package com.example.designpattern.DesignTicTacToe;

public class Info {

    // Objects :
    // 1) Piece/Symbol - O, X etc.
    // 2) Player - 1, 2, 3 etc.
    // 3) Board - 3*3 or 4*4 etc.

    // 1. Create an Enum (PieceType)

    // 2. Create a PalyingPiece class which will have PieceType

    // 3. Then we will have PlayingPieceX and PlayingPieceO class which will be used
    // to assign PieceType to a player. Actually we are creating PalyingPieceX and
    // PlayingPieceO classes because of Type Safety while creating Object

    // 4. Create Player class with name as property and has a PlayingPiece of the
    // type (X or O) chosed by the Player.

    // 5. Create Board class with size as property.
    // -- It will have "isPieceAdded method" which will return boolean 'false' if
    // something is present in the input indexes else it will add the input 'piece'
    // and return true.
    // -- It will have another method "getFreeCells" which will return 
    // List<Pair<Integer, Integer>> (List of all the available co-ordinates)
    
    // 6. Now come the TicTacGame class
    // -- We wiil have 'List of players' and 'Board'.
    // "The List here will be 'Queue' because I need to remove from the first whose 
    // turn is over and put that player at the last 
}
