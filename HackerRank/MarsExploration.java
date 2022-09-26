import java.io.*;

class Result {
    public static int signal(String s) {
        String expected = "SOS";
        int j = 0, count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == expected.charAt(j)) count++;
            if(j == 2){
                j = 0;
                continue;
            }
            j++;
        }
        return s.length() - count;
    }

}

public class MarsExploration {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.signal(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
