import java.util.regex.Matcher;
import java.util.regex.Pattern;

class exp12 {
    public static void main(String[] args) {
        String text = "Contact: student77@example.com, help@test.org";
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Matched email: " + matcher.group());
        }

        String phone = "9876543210";
        System.out.println("Valid 10-digit phone: " + phone.matches("\\d{10}"));
    }
}
