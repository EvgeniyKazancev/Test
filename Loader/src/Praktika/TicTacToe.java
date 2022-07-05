package Praktika;



/**public class TicTacToe {
    String newPlayer;
    String[][] field;

    public TicTacToe() {
        newGame();
    }

    void newGame() {
        field = new String[][]{{-, -, -},
                               {-, -, -},
                              {-, -, -}};
        newPlayer = "X";
    }

    String[][] getField() {
        return field;
    }

    String checkGame() {
        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("0") || field[i][j].equals("-"))
                    check = false;
            }
            if (check) return "X";
        }
        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("X") || field[i][j].equals("-"))
                    check = false;
            }
            if (check) return "0";
            for (int i = 0; i < 3; i++) {
                boolean check = true;
                for (int j = 0; j < 3; j++) {
                    if (field[j][i].equals("0") || field[j][i].equals("-"))
                        check = false;
                }
                if (check) return "X";


                for (int i = 0; i < 3; i++) {
                    boolean check = true;
                    for (int j = 0; j < 3; j++) {
                        if (field[j][i].equals("X") || field[j][i].equals("-"))
                            check = false;
                    }
                    if (check) return "0";
                }
                String[] diagonal = {field[0][0], field[1][1], field[2][2]};
                String[] diagonal1 = {field[0][2], field[1][1], field[2][0]};

                for (int i = 0; i < 3; i++) {
                    boolean check = true;
                    if (diagonal[i].equals("0") || diagonal[i].equals("-"))
                        check = false;
                }
                if (check) return "X";

                for (int i = 0; i < 3; i++) {
                    boolean check = true;
                    if (diagonal1[i].equals("0") || diagonal1[i].equals("-"))
                        check = false;
                }
                if (check) return "0";
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (field[i][j].equals("-")) return null;
                }
                return "D";
            }
            String makeMove ( int x, int y){
                x = 0;
                y = 0;
                String check = this.checkGame();
                if (!field[x][y].equals("-")) {
                    return "Cell" + (x + 1) + "," + (y + 1) + "is already occupied";
                    field[x][y] = newPlayer;
                }
                check = checkGame();
                if (check != null) {
                    if (check.equals("X"))
                        return " Player X won";
                } else if (check.equals("0")) return "Player O won";
                else return "Draw";
            }
            newPlayer = newPlayer.equals("X") ? "0" : "X";
            return "Moved completed";
            }


        }
    }
}**/