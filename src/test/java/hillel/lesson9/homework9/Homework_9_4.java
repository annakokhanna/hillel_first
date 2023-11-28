package hillel.lesson9.homework9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework_9_4 {

    public static void main(String[] arg) {

        //+38(0хх)ххххххх  - +380636751375
        String text = "Phone number in Ukraine +380914817686 \n" +
                "\n" +
                " +380931755240 \n" +
                "\n" +
                "+380914817467\n" +
                "\n" +
                " +380914811143 \n" +
                "\n" +
                " +380914819490 \n" +
                "\n" +
                " +38091300 \n" +
                "\n" +
                " +38091e11y596 \n" +
                "\n" +
                " +380914817053 \n" +
                "\n" +
                " +380914817296 \n";

        System.out.println(findPhone(text));
    }

    public static String findPhone(String text) {
        StringBuilder phone = new StringBuilder();
        String regex = "\\+380\\d{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            phone.append(matcher.group());
            phone.append("\n");
        }
        return phone.toString();
    }
}


