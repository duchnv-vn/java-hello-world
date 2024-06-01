package exercise_1;

import java.text.SimpleDateFormat;

public class Exercise {
    public static void main(String[] args) {
        System.out.println(createDateAndParse());
    }

    public static String createDateAndParse() {
        var MMMddyyyyFormat = new SimpleDateFormat("MMM dd yyyy");
        var yyMMMMddHHmmssFormat = new SimpleDateFormat("yy-MMMM-dd HH:mm:ss");

        try {
            var dateSource = "Dec 25 2026";
            var date = MMMddyyyyFormat.parse(dateSource);
            var dateOutput = yyMMMMddHHmmssFormat.format(date);

            return dateOutput;
        } catch (Exception e) {
            return null;
        }
    }
}
