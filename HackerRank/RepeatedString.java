import java.io.*;

class Result {
    public static long repeatedStr(String s, long n) {
        long ans = 0;
        ans = ans + (long)Math.floor(n/s.length()) * count(s, (long)s.length());
        long temp = n - (long)Math.floor(n/s.length()) * (long)s.length();
        ans = ans + count(s, temp);
        return ans;
    }

    public static int count(String s, long n){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'a') count++;
        }
        return count;
    }
}

public class RepeatedString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedStr(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
