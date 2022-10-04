package All;

import java.time.*;
import java.util.Date;

public class Time {

    private static LocalTime Time(Date date) {

        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        return zonedDateTime.toLocalTime();
    }
}
