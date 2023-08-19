import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.SimpleFormatter;

class Result {
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. INTEGER month
     * 2. INTEGER day
     * 3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        if (year > 2000 && year < 3000) {
            // Calendar c = Calendar.getInstance();
            
            Calendar c = new GregorianCalendar(year, month - 1 , day);
            c.setTimeZone(TimeZone.getDefault());
            // c.set(Calendar.YEAR, year);
            // c.set(Calendar.MONTH, month - 1);
            // c.set(Calendar.DATE, day);
            // c.setTimeZone(TimeZone.getTimeZone("UTC"));

            // SimpleDateFormat sf = new SimpleDateFormat("MM dd yyyy");
            // System.out.println(sf.format(c.getTime()));

            String dayOfWeek = "";
            int dayweek = c.get(Calendar.DAY_OF_WEEK);
            // if(year < 2013){
            //     dayweek = c.get(Calendar.DAY_OF_WEEK);
            // }
            switch (dayweek) {
                case 1:
                    dayOfWeek = "sunday".toUpperCase();
                    break;
                case 2:
                    dayOfWeek = "monday".toUpperCase();
                    break;
                case 3:
                    dayOfWeek = "tuesday".toUpperCase();
                    break;
                case 4:
                    dayOfWeek = "WEDNESDAY".toUpperCase();
                    break;
                case 5:
                    dayOfWeek = "thursday".toUpperCase();
                    break;
                case 6:
                    dayOfWeek = "friday".toUpperCase();
                    break;
                case 7:
                    dayOfWeek = "saturday".toUpperCase();
                    break;
            }

            return dayOfWeek;
        }

        return null;
    }

}

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        System.out.println(res);
        // bufferedWriter.write(res);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
