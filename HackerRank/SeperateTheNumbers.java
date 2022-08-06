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
     * Complete the 'separateNumbers' function below.
     *
     * The function accepts STRING s as parameter.
     */

    public static void separateNumbers(String s) {
    // Write your code here
        int flag = 0;
        String x = "";
        String temp = "";
        for(int i = 1; i <= s.length()/2; i++)
        {
            x = s.substring(0, i);
            Long v = Long.parseLong(x);
            while(x.length() < s.length())
            {
                x += Long.toString(++v);
            }
            if(x.equals(s))
            {
                temp = s.substring(0, i);
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            System.out.println("YES "+temp);
        else
            System.out.println("NO");
    }

}

public class SeperateTheNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                Result.separateNumbers(s);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
