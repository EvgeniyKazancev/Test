package Practic2.Z1.Chess;

public class Queen extends ChessPiece{
    public Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(line < 0 || toLine > 7 || column < 0 || toColumn > 7 ) return false;
        else if(column == toColumn && line != toLine || column != toColumn && line == toLine || Math.abs(line - column) == Math.abs(toLine - toColumn) || Math.abs(line + column) == Math.abs(toLine + toColumn)) return true;

       else return false;
    }

    @Override
    public String getSimbl() {
        return "Q";
    }
}
