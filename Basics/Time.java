import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time{
    public static void main(String[] args) {

        LocalDate myObj = LocalDate.now();
        LocalTime myObj2 = LocalTime.now();
        LocalDateTime myObj3 = LocalDateTime.now();

        System.out.println(myObj);
        System.out.println(myObj2);
        System.out.println(myObj3);
        
        //Formatting
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myObj3.format(myFormatObj); 
        System.out.println("After formating: " + formattedDate);
    }
}