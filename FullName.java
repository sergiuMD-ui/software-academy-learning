public class FullName {

    public static String formatName(String fullName){

        if(fullName == null || fullName.trim().isEmpty())
        {
            return "Invalid name";
        }
        else{
            fullName = fullName.trim();
        }

        int spaceIndex = fullName.indexOf(" ");
        if(spaceIndex == -1)
        {
            return fullName;
        }

        String firstName = fullName.substring(0, spaceIndex);
        String lastName = fullName.substring(spaceIndex+1);

        return lastName+ ", " +firstName;
    }

    //for main:
    /*System.out.println(FullName.formatName("John Smith"));
    System.out.println(FullName.formatName("   Alice "));
    System.out.println(FullName.formatName(" Joker Boss   "));*/

}
