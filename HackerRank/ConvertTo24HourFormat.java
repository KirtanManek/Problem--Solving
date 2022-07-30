import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) throws Exception {
    // Write your code here
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        String end = s.substring(8);
        s = s.substring(0, 8);
        Date date = parseFormat.parse(s + " " + end);
        String dateToString = displayFormat.format(date);
        return dateToString;
    }

}

public class ConvertTo24HourFormat {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
