import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeValidation {
    public static boolean isValidAge(String birthDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate formattedDate = LocalDate.parse(birthDate, formatter);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(formattedDate, currentDate);
        if(age.getYears()>=18) return true;
        return false;
    }
}
