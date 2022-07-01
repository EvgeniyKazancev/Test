package Tank;

 class Tank {
   /*private int position;
   public void goForward(int i) {
       position += i;
   }
   public void goBackward(int i){
       position -=i;
       }
   public void printPosition(){
        System.out.println("The Tank is at " + position + "  now.");

   }*/

     static final String Model = ("T 34 - ");
     static int ntanks;
     private int x,y;
     private int dir;
     private int fuel;
     private int n;

    public Tank() {
        this( 0, 0, 100);
        //this.n = 1;

    }

    public Tank (int x, int y){
        this (x,y,100);
        //this.n = 2;

    }
    public Tank (int x, int y,int fuel){
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        //this.n = 3;
      n = ntanks++;
    }
     public void goForward(int i) {
       if (i < 0 && -i > fuel)
             i = - fuel;
             else if ( i > fuel)
                 i =fuel;
             if (dir == 0) x += i;
             else if (dir == 1) y += i;
             else if (dir == 2) x -= i;
             else y-=  i;
             fuel -= Math.abs(i);
             {

       }

     }
     public void printPosition() {
         System.out.println("The Tank " + Model + n + "  is at " + x + " , " + y + " now."    );
     }
     public void turnRight() {
        dir++;
         if (dir == 4) dir = 0;
     }
     public void turnLeft() {
        dir--;
         if (dir == -1) dir = 3;
     }
     public void goBackward(int i) {
         goForward(-i);
     }

 }






