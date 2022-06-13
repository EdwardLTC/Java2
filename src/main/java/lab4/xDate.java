package lab4;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class xDate {
    public static java.util.Date parse(String text) throws RuntimeException, ParseException {
        SimpleDateFormat formater = new SimpleDateFormat();
        formater.applyPattern("dd-MM-yyyy");
        return  formater.parse(text);
    }

    public static java.util.Date parse(String text, String pattern) throws RuntimeException, ParseException {
        SimpleDateFormat formater = new SimpleDateFormat();
        formater.applyPattern(pattern);
        return  formater.parse(text);
    }
}
