import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void ageInYears(LocalDate birthDate){
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Birthdate: " + birthDate);
        System.out.println("Today: " + currentDate);
        System.out.println("Age: " +years+ " years, " + months+ " months, " + days + " days.");

        //for main:
        /*
        * LocalDate birthday = LocalDate.of(1994,12,27);
        CalculateAge.ageInYears(birthday);
        * */
    }
}
