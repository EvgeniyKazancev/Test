package Praktika;

import java.util.Scanner;

public class Balance {

        int r =0;
        int l = 0;
        void addRight ( int n){
            r += n;
        }
        void addLeft ( int n){
            l += n;

        }
        String getSituation () {
            if (r == l) return "=";
            else if (r > l) return "r";
            else return "l";
        }
    }
