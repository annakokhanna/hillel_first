package hillel.lesson10_11.homework10_11;

public class MessageGenerator {
    // Додайте методи для генерації різних типів повідомлень
    // Наприклад, infoMessage, errorMessage, тощо

    public static String infoMessage(String title, String... details) {
        String format = "INFO: %s%nDetails: %s";
        return generateMessage(format, title, String.join(", ", details));
    }

    public static String errorMessage(String errorDescription, int errorCode, String... details) {
        String format = "ERROR %d: %s%nDetails: %s";
        return generateMessage(format, errorCode, errorDescription, String.join(", ", details));
    }

    private static String generateMessage(String format, Object... args) {
        return String.format(format, args);
    }

    public static void main(String[] args) {
        String info = MessageGenerator.infoMessage("Start", "Version 1.0");
        System.out.println(info);

        String error = MessageGenerator.errorMessage("File not found", 404, "Error loading", "Try again late");
        System.out.println(error);
    }
}