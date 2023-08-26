package time;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeUtils {
    
    public static String longToString(){

        long timestamp = 1692954327L;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmmssZ")
                .withZone(ZoneId.of("UTC+9")); // UTC+9 시간대로 설정

        return formatter.format(Instant.ofEpochMilli(timestamp));
    }

    public static long timeZoneStringToLong(String timestamp) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmmssZ")
                .withZone(ZoneId.of("UTC+9")); // UTC+9 시간대로 설정

        return Timestamp.valueOf(LocalDateTime.parse(timestamp, formatter)).getTime();
    }
}
