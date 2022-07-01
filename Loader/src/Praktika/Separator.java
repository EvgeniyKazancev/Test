package Praktika;

public class Separator {
    int[] array;
    public Separator(int[] array ){
        this.array = array;
    }
    int[] even() {
        int[] evens = new int[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) ;
            evens[counter++] = array[i];

        }
        return evens;
    }
        int[] odd (){
            int[] odds = new int[array.length];
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) ;
                odds[counter++] = array[i];
            }
        return odds;
        }
    }
