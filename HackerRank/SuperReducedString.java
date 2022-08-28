import java.io.*;

class Result {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String reducedString(String s) {
    // Write your code here
        StringBuilder ans = new StringBuilder(s);
        
        int i = 0;
        while(i+1 < ans.length()){
            if (ans.charAt(i) == ans.charAt(i+1)){
                ans.delete(i, i+2);
                i = 0;
            }
            else i++;
        }
        
        if (ans.toString().equals("")) return "Empty String";
        else return ans.toString();
    }

}

public class SuperReducedString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.reducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
