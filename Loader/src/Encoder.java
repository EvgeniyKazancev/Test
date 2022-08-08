import java.text.SimpleDateFormat;

public class Encoder {

   private String text;

    public Encoder(String text) {
        this.text = text;
    }

    String Encoder(String text){
        text.replaceAll("a","z");
       return text;
    }

    String Decoder(Encoder encoder){
        text.replaceAll("z", "a");
        return text;
    }

}
