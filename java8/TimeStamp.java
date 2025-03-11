package java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TimeStamp {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate localDate = LocalDate.of(2025, 3, 12);
        System.out.println(now);
        LocalDate parse = LocalDate.parse("2025-03-12");
        System.out.println(parse);
        long between = ChronoUnit.DAYS.between(now,parse);
        System.out.println(between);
        LocalDate minus = parse.minusDays(2);
        if(minus.isEqual(now)){
            System.out.println("Both are Equal");
        }

    }
}
