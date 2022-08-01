// Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
// Then print the respective minimum and maximum values as a single line of two space-separated long integers.




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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        List<Long> ans = new ArrayList<Long>();
        long temp = 0;
        for (int i = 0; i < arr.size(); i++){
            temp += Long.valueOf(arr.get(i));
        }
        for (int i = 0; i < arr.size(); i++) {
            ans.add(temp - Long.valueOf(arr.get(i)));
        }
        Collections.sort(ans);
        System.out.print(ans.get(0) + " ");
        System.out.print(ans.get(ans.size() - 1));
    }

}

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}


/*
public class Solution{
    public static void main(String[] args) {
    // W rite your code here
    Scanner sc = new Scanner(System.in);
    //BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    String a[]=sc.nextLine().split(" ");
    long temp = 0 ;
    long sum=0;
    Arrays.sort(a);
    for(int k = 0 ; k < a.length ; k++){
        sum+=Long.parseLong(a[k]);
    }
    System.out.println((sum-Long.parseLong(a[a.length-1]))+" "+(sum-Long.parseLong(a[0])));
    
        
    }
}
*/
