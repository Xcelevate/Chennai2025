package DateTime;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LearnDate {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        LocalTime lt = LocalTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh");

        LocalTime lt2 = LocalTime.now();

       // LocalTime dt2 = LocalTime.parse(dd,DateTimeFormatter.ofPattern("hh:mm:ss"));

        System.out.println(lt);
        System.out.println(lt2);
        System.out.println(lt2.isAfter(lt));
    }
}
