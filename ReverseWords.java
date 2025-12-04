public class ReverseWords {
    public static String reverseSentence(String sentence){
        if(sentence == null || sentence.isBlank()) {
            return "Invalid sentence";
        }

        String[] words = sentence.trim().split(" +");

        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1; i>=0; i--){
            sb.append(words[i]);
            if(i > 0){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
