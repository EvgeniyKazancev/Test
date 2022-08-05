package Practic2.Z1.Chess;

public class Rook extends ChessPiece{
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(line < 0 || toLine > 7 || column < 0 || toColumn > 7 ) return false;
        else if (column == toColumn && line != toLine || column != toColumn && line == toLine ) return true;
        else return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
