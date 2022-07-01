package Praktika;

public class Bell {
   Boolean ding =  true;
       void sound(){
       if (ding) {
           System.out.println("ding");
       }else{
           System.out.println("dong");
    }
    ding = !ding;
}
}