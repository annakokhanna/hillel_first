package hillel.lesson9.homework9;

public class Homework_9_1 {


    public static void main(String[] arg) {
        String original = "Java, World!";
        String reversed = stringRevers(original);
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }

    public static String stringRevers(String str) {
        if (str.length() == 0) {
            return str;
        }
        return stringRevers(str.substring(1)) + str.charAt(0);
    }
}
