public class MonthDaysCalculator {
    public static int calculateDays(Object month){

        if(month == null){
            return -1;
        }

        if(month instanceof Integer data) {
             return switch (data) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 28;
                case 4, 6, 9, 11 -> 30;
                default -> -1;
            };
        }

        return -1;

    }
}
