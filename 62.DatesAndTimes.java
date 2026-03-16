import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args) {
        // How to work with DATES & TIMES using Java
        //(LocalDate, LOcalTime, LocalDateTime, UTC timeStamp)

       // LocalDate date  = LocalDate.now(); //2026-03-16
       // LocalTime time  = LocalTime.now();  //13:32:34.094983900

        //LocalDateTime dateTime  = LocalDateTime.now();  //2026-03-16T13:33:39.630516700

        Instant instant = Instant.now();  //2026-03-16T07:34:29.640987400Z(UTC)


    /*
        //Custom format

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter); //16/03/2026 13:36:58

        System.out.println(newDateTime);

        */


        //LocalDate date = LocalDate.of(2025, 03, 16); //2025-03-16

        LocalDateTime date = LocalDateTime.of(2025, 03, 16, 12, 0 ,0 ); //2025-03-16T12:00
        LocalDateTime date1 = LocalDateTime.of(2025, 1, 2, 12, 0 ,0 );
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0 ,0 );

        if(date1.isBefore(date2)){
            System.out.println(date1 + " is earlier than " + date2);
        }
        else if(date1.isAfter(date2)){
            System.out.println(date1 + " is later than " + date2);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1 + " is equal to " + date2);
        }
    }
}
