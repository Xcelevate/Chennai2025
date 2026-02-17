package DateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Sample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("current date  " + date );
        System.out.println("formatted date  " +  date.format( DateTimeFormatter.ofPattern(" dd / MM / yyyy ")));
        System.out.println("next days  " + date.plusDays(3));
        System.out.println("before days   "  +  date.minusDays(3));
        String dateStr = "22.05.2005";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate changeDateStr = LocalDate.parse(dateStr, dateFormatter);
        System.out.println("string date converted into local date  " +  changeDateStr);
        System.out.println("month only  " + date.getMonthValue() );
        System.out.println("year only  " + date.getYear() );
        System.out.println("day only  " + date.getDayOfMonth() );


        LocalTime time = LocalTime.now();
        System.out.println("current time  " + time);
        System.out.println("formatted time  " +  time.format( DateTimeFormatter.ofPattern("HH : mm : ss")));
        System.out.println("next hour time  " + time.plusHours(2));
        System.out.println("before hour time  " +  time.minusHours(2));
        System.out.println("after minute time  " +  time.plusMinutes(45));
        System.out.println("before minute time  " +  time.minusMinutes(45));
        System.out.println("after seconds time  " +  time.plusSeconds(30));
        System.out.println("before seconds time  " +  time.minusSeconds(30));
        String timeStr = "45:30:16";
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("ss:mm:HH");
        LocalTime changeTimeStr = LocalTime.parse(timeStr , timeFormatter);
        System.out.println("string time converted into local time  " +  changeTimeStr.format(DateTimeFormatter.ofPattern("hh : mm : ss")));
        System.out.println("hour only  " + changeTimeStr.getHour() );
        System.out.println("minute only " + changeTimeStr.getMinute() );
        System.out.println("second only " + changeTimeStr.getSecond() );
    }
}
