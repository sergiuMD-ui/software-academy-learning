import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class NextBirthday {
    public static void calculateBirthday(LocalDate birthDate){
        if(birthDate.getMonth() == LocalDate.now().getMonth() && birthDate.getDayOfMonth() == LocalDate.now().getDayOfMonth()){
            System.out.println("Happy birthday!");
            return;
        }

        int year = birthDate.getYear();
        int month = birthDate.getMonthValue();
        int day = birthDate.getDayOfMonth();

        LocalDate now = LocalDate.now();
        LocalDate nextBirthday = LocalDate.of(now.getYear()+1, month, day);

        Period period = Period.between(now, nextBirthday);
        if(period.getYears()>0)
        {
            period = period.minusYears(1);
        }

        System.out.println("Until next birthday: " + period);
        System.out.println("Next birthday in: " + period.getMonths() + " months, " + period.getDays() + " days");



    }
}
