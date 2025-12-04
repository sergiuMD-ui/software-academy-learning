import java.util.Arrays;

public class ListArray {
    public static String listingArray(String[] words){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< words.length; i++){
            if(words[i] == null || words[i].isBlank())
            {
                return "Invalid list of words";
            }
            String formatted = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);

            sb.append(formatted);

            if(i < words.length -1){
                sb.append(",");
            }
        }

        return sb.toString();

    }
}
