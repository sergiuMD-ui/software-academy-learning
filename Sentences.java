public class Sentences {
    public static String makeSentence(String[] words){
        StringBuilder sb = new StringBuilder();
        for(String string: words){
            if(string.isBlank()){
                continue;
            }
            string = string.substring(0,1).toUpperCase() + string.substring(1).toLowerCase() + " ";
            sb.append(string);
        }


        return sb.toString().trim();
    }

    //for main:
    //System.out.println(Sentences.makeSentence(new String[]{"this", "  ", "", "the", "first", "run"}));
}
