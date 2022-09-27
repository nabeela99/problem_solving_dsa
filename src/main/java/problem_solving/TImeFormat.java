package problem_solving;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TImeFormat {

    public static String timeConversion(String s) throws ParseException {
        SimpleDateFormat formatTime = new SimpleDateFormat("hh:mm:ssaa");
        Date date = formatTime.parse(s);
        SimpleDateFormat target = new SimpleDateFormat("HH:mm:ss");
        String targetDate = target.format(date);
        return targetDate;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(TImeFormat.timeConversion("07:05:45PM"));
    }
}
