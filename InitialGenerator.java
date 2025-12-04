public class InitialGenerator {
    public static String nameInitials(String name){

        if(name == null || name.isBlank()){
            return "Invalid name";
        }

        name = name.trim();

        int spaceIndex = name.indexOf(" ");
        if(spaceIndex == -1){
            return name.charAt(0) + ".";
        }

        return name.charAt(0) + "." + name.charAt(spaceIndex+1) + ".";
    }

    /* for main:
        System.out.println(InitialGenerator.nameInitials("John Doe"));
        System.out.println(InitialGenerator.nameInitials("Madison"));
        System.out.println(InitialGenerator.nameInitials("   Terry Hugh "));
        System.out.println(InitialGenerator.nameInitials("  "));
        System.out.println(InitialGenerator.nameInitials(null));
    * */
}
