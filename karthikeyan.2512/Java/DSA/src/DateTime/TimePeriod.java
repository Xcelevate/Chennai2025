package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TimePeriod {
    public static void main(String[] args) {
        Scanner kk = new Scanner(System.in);
        System.out.print("Enter the from date : ");
        String from = kk.nextLine();
        System.out.print("Enter the to date : ");
        String to = kk.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMM yyyy");
        LocalDate fromDate = LocalDate.parse(from, formatter);
        LocalDate toDate = LocalDate.parse(to, formatter);
        long days = ChronoUnit.YEARS.between(fromDate, toDate);
        System.out.println(days + " days.");
        System.out.println(fromDate.format(formatter2));
        System.out.println(fromDate.isBefore(toDate));

    }
}
