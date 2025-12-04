public class TemperatureCategory {
    public static String temperatureFeeling(Object temp){
        if(temp == null){
            return "Input is null";
        }

        if(temp instanceof Number data){
            Double value = data.doubleValue();

            return switch (value){
                case Double a when a<0 -> "Freezing";
                case Double a when a<=15 -> "Cold";
                case Double a when a<=25 -> "Mild";
                case Double a when a<=35 -> "Warm";
                case Double a when a>35 -> "Hot";
                default -> "Invalid input";
            };
        }
        return "Invalid input";
    }

    /* for main:
        System.out.println(TemperatureCategory.temperatureFeeling(14.2));
        System.out.println(TemperatureCategory.temperatureFeeling(-4));
        System.out.println(TemperatureCategory.temperatureFeeling(0));
        System.out.println(TemperatureCategory.temperatureFeeling(36.521));
        System.out.println(TemperatureCategory.temperatureFeeling("Cold"));
        System.out.println(TemperatureCategory.temperatureFeeling(null));
    * */
}
