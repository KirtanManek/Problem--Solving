import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic) {
        int max = 0;
        int count = 0;
        int counter = 0;
        for (int i = 0; i < topic.size(); i++) {
            for (int j = i; j < topic.size(); j++) {
                count = compareStr(topic.get(i), topic.get(j));
                if (count > max) {
                    max = count;
                    counter = 1;
                } else if (count == max) {
                    counter++;   
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(max);
        list.add(counter);
        return list;
    }
    
    public static int compareStr(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '1' || str2.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
    
    public static int count(String s)
    {
        int res = 0;
        for (int i=0; i<s.length(); i++)
        {
            // checking character in string
            if (s.charAt(i) == '1')
            res++;
        }
        return res;
    }
}

public class ACM_ICPC_Team {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.acmTeam(topic);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
