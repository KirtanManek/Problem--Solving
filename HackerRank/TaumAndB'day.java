import java.io.*;
import java.util.stream.*;

class Result {
    public static long taumBday(long b, long w, long bc, long wc, long z) {
        return b * Math.min(bc, wc + z) + w * Math.min(wc, bc + z);
    }
}

public class TaumAndB'day {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = Long.parseLong(bufferedReader.readLine().trim());

        LongStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                long b = Long.parseLong(firstMultipleInput[0]);

                long w = Long.parseLong(firstMultipleInput[1]);

                String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                long bc = Long.parseLong(secondMultipleInput[0]);

                long wc = Long.parseLong(secondMultipleInput[1]);

                long z = Long.parseLong(secondMultipleInput[2]);

                long result = Result.taumBday(b, w, bc, wc, z);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
