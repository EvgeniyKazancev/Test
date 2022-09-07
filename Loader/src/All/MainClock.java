package All;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.zip.DataFormatException;

public class MainClock  {
    public static void main(String[] args) throws InterruptedException{


        ConsoleClock cc = new ConsoleClock();
        cc.start();
        Thread.sleep(3000);
        cc.interrupt();


    }
}
