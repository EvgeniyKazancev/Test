package Massiv;

public class Main1 {
    public static void main(String[] args) {
       //int i,j;
       String[] result = new String[5];
       int[][] ball = { {7,8,2,9,9},
                        {5,5,7,2,3},
                        {2,4,8,9,6,},
                        {3,6,8,2,7},
                        {4,5,4,4,6}};
        int[] sumBall = new int[5];
           String[] names = {"Saha","Igor","Misha","Koly","Vladimer"};
        for (int i =0; i < ball.length; i++ ) {
           for (int j = 0; j < ball.length; j++ ){
               sumBall[i] += ball[i][j];
           }
           result[i] = names[i] + " " +sumBall[i];


            System.out.println(result[i]);
    }
}
}