import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("The current date and time is :" + current);
        // Display in dd/MM/yyyy
        DateTimeFormatter dmy =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String DmyFormatted = current.format(dmy);
        System.out.println("Today is:" + DmyFormatted  );
        // Display in yyyy-dd-MM
        DateTimeFormatter ydm =
                DateTimeFormatter.ofPattern("yyyy-dd-MM");
        String ydmFormatted = current.format(ydm);
        System.out.println("Today is:" + ydmFormatted);

        //Display in MMMM dd, yyyy
        DateTimeFormatter mdy =
                DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String mdyFormatted = current.format(mdy);
        System.out.println("Today is:" + mdyFormatted);
        //Display in gmt time
        DateTimeFormatter gmt =
                DateTimeFormatter.ofPattern("E, MMM dd, yyyy h:mm:ss");
        String formattedDate = current.format(gmt);
        System.out.println("GMT time:" + formattedDate);

        DateTimeFormatter localTimeZone =
                DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy");
        String localDate = current.format(localTimeZone);
        System.out.println("Local time zone:" + localDate);
    }

}
