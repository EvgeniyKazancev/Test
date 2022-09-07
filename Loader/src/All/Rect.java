package All;

public class Rect {
    public static void main(String[] args) {

    }
    private int s; int w, h;
    Rect(int w, int h){
        this.w = w;
        this.h = h;
        s = w * h;
    Rect r = new Rect (20,30);
    r.w = 1;
    }
    int getS(){
        return s;
    }
    int getW(){
        return w;
    }
    int getH(){
        return h;
    }

}

