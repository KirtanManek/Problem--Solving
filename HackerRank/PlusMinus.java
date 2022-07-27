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

    public static void proportion(List<Integer> arr, int n) {
    // Write your code here
        double plus = 0, minus = 0,zero = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > 0) plus++;
            else if (arr.get(i) < 0) minus++;
            else zero++;
        }
        double positive = plus / n;
        double negative = minus / n;
        double zeros = zero / n;
        System.out.format("%.6f\n",positive);
        System.out.format("%.6f\n",negative);
        System.out.format("%.6f\n",zeros);
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.proportion(arr, n);

        bufferedReader.close();
    }
}
