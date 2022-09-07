package All;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.WeakHashMap;

public class ConsoleClock extends Thread {


        @Override
    public void run() {
        while (!isInterrupted()) {
           // DateFormat time = new SimpleDateFormat("HH:mm:ss");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            ZonedDateTime time = ZonedDateTime.now();
            String formattedString = time.format(formatter);
            System.out.println(formattedString);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("The clock was stopped");
    }
}

