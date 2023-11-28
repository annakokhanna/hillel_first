package hillel.lesson9.homework9;

public class Homework_9_3 {

    public static void main(String[] arg) {

        String initialString = "abcd4efabc123deabcdaaa";
        String[] characterRemove = {"a", "d", "3"};
        String modifiedString = stringRemove(initialString, characterRemove);

//        System.out.println("Modified string: " + initialString.replaceAll("a", "").replaceAll("d", "").replaceAll("3", ""));

        System.out.println("Initial string: " + initialString);
        System.out.println("Characters to remove: " + String.join(", ", characterRemove));
        System.out.println("Modified string: " + modifiedString);
    }

    public static String stringRemove(String initialString, String[] characterRemove) {
        if (initialString == null || characterRemove == null || initialString.length() == 0) {
            return initialString;
        }

        for (String character : characterRemove) {
            initialString = initialString.replace(character, "");
        }
        return initialString;
    }
}
