package hillel.lesson9.homework9;

public class Homework_9_2 {

    public static void main(String[] arg) {
        String mainString = "This is the test string";
        String removableString = "st";
        String newString = replaceString(mainString, removableString);

        System.out.println("The main string is: " + mainString);
        System.out.println("The removable string is: " + removableString);
        System.out.println("The new string is: " + newString);

    }

    public static String replaceString(String mainString, String removableString) {
        if (mainString == null || removableString == null) {
            return mainString;
        }
        return mainString.replaceAll(removableString, "");

    }
}
