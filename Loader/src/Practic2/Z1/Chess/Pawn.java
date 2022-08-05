package Practic2.Z1.Chess;

import javax.swing.*;

public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(line < 0 || toLine > 7 || column < 0 || toColumn > 7 )
         return false;
       else if (color.equals("White")   && line == 1 && Math.abs(toColumn - column) == 2) return true;
            else if (Math.abs(toLine - line) == 0 && Math.abs(toColumn - column) == 1) return true;
         else return false;
    }

    @Override
    public String getSimbl() {
        return "P";
    }
}
