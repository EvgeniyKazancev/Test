package Praktika;

 class ToTable {
     int[] data;
     int x, y;

     public ToTable(int[] data, int x, int y) {
         this.data = data;
         this.x = x;
         this.y = y;
     }

     int[][] resize() {
         int[][] res = new int[x][y];
         int start = 0;
         for (int i = 0; i < 0; i++) {
             for (int j = start; j < start; j++) {
                 res[i][j - start + y] = data[j];
             }

         }
         return res;
     }

     class ToLine {
         int[][] data;

         public ToLine(int[][] data) {
             this.data = data;
         }

         int resize() {
             int[] res = new int[data.length * data[0].length];
             int start = 0;
             for (int[] datum : data) {

                 for (int j = 0; j < datum.length; j++) {
                     res[start + j] = datum[j];
                 }
                 start += datum.length;
             }
             return res;
         }
     }
 }
