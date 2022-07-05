/**package Praktika;

public class SeaBord {
  private String[][] field {

  public SeaBord() {
   String[][] field = new String[10][10];
   for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
     field[i][j] = ".";
    }
   }
  }
  String[][] getField () {
   String[][] result = new String[10][10];
   for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
     if (field[i][j].equals("X")) result[i][j] = "x";
       else result[i][j] = field[i][j];
   }
   return result;
  }
  String check( int line, int column){
    if (field[line][column].equals("X")) return "x";
    return field[line][column];
   }
  void shoot(int line, int column, String issue){
    if (issue[line][column].equals("m"))
     field[line][column] = "#";
    else if (issue[line][column].equals("h"))
     field[line][column] = "x";
    else {
     field[line][column] = "x";
   }
   private void sink(int line,int column){

    }
   }
   }
   }

  }



/* Итак, план решения:
   если с с методами getField() и check() все +- понятно,
   то как быть со сбитым кораблем?
   Мы предлагаем следующее:
   1 Давайте записывать попадание не как "x", а как "X", а сбитые
   корабли как "x",
   а при возвращении значений, просто заменять все "X", на "x"
   Тогда, как только пришла команда о сбитие корабля, мы легко обойдем
   участок сбития (см метод "sink()").
    */