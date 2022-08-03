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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int Birds(int[] arr, int n) {
    // Write your code here
        int ary[] = new int[n];
        for(int i = 0; i < n ; i++ )
        ary[arr[i]]++; 
        int max = 0,maxpos=0;
        for(int i = 0 ; i < n ; i++)
            {
            if(ary[i] > max)
                {
                max = ary[i];
                maxpos = i;
            }
        }
        return maxpos;
    }

}

public class MigratoryBirds {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int birdTypes = input.nextInt();
        
        // String array = input.next();
        // String[] str = array.split(" ");
        int[] arr = new int[birdTypes];
        
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        int ans = Result.Birds(arr, birdTypes);
        System.out.println(ans);
        input.close();
    }
}
