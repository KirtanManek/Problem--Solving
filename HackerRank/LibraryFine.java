import java.io.*;
class Result {
    public static int fine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int ans = 0;
        if(y1 > y2 || y1 < y2) ans = ans + mod(y1 - y2) * 10000;
        else{
            if(m1 > m2 || m1 < m2) ans = ans + mod(m1 - m2) * 500;
            else ans = ans + mod(d1 - d2) * 15;
        }
        return ans;
    }
    
    public static int mod(int a){
        if(a >= 0) return a;
        else return 0;
    }
}

public class LibraryFine {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d1 = Integer.parseInt(firstMultipleInput[0]);

        int m1 = Integer.parseInt(firstMultipleInput[1]);

        int y1 = Integer.parseInt(firstMultipleInput[2]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d2 = Integer.parseInt(secondMultipleInput[0]);

        int m2 = Integer.parseInt(secondMultipleInput[1]);

        int y2 = Integer.parseInt(secondMultipleInput[2]);

        int result = Result.fine(d1, m1, y1, d2, m2, y2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
