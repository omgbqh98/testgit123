import static java.lang.System.*;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class test {
    public static void main(String[] args) {
        Instant start;
        start = Instant.parse("2020-01-04T05:10:56.392Z");
        Instant end;
        end = Instant.parse("2020-01-04T05:10:57.392Z");

        Duration duration;
        duration = Duration.between(start, end);

        out.println(duration);

    }
}
