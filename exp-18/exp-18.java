import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;

class exp18 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Date: " + today);
        System.out.println("Time: " + now);
        System.out.println("Date and time: " + dateTime.format(formatter));
        System.out.println("Tomorrow: " + today.plusDays(1));
        System.out.println("Date after one month: " + today.plusMonths(1));
        System.out.println("Period between today and 1 Jan 2027: " +
                Period.between(today, LocalDate.of(2027, 1, 1)));
    }
}
