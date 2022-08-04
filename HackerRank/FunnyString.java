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
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String checkFunnyString(String s) {
    // Write your code here
        String sRev = "";
        String ans = "Funny";
        for (int i = s.length() - 1; i >= 0; i--){
            sRev += s.charAt(i);
        }
        List<Integer> str = diff(s);
        List<Integer> strRev = diff(sRev);
        for (int i = 0; i < str.size(); i++){
            if (str.get(i) != strRev.get(i)) ans = "Not Funny";
        }
        return ans;
    }
    
    public static List<Integer> diff(String str){
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++){
            ans.add(Math.abs((int)str.charAt(i) - (int)str.charAt(i+1)));
        }
        return ans;
    }

}

public class FunnyString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.checkFunnyString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
