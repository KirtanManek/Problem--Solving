import java.io.*;
import java.util.*;

class Result {

    private static int alternatingLength(String orig, String aString, String bString) {
        Stack<Character> st = new Stack<>();
        char a = aString.charAt(0);
        char b = bString.charAt(0);
        
        for (int i = 0; i < orig.length(); i++) {
            char c = orig.charAt(i);
            
            if (c == a || c == b) {
                if (st.isEmpty() || st.peek() != c) {
                    st.push(c);
                }
                else {
                    // The alternating string doesn't exist
                    return -1;
                }
            }
        }
        // Returns the alternating string's length
        return st.size();
    }
    
    public static int alternate(String s) {
    // Write your code here
        // Gets all the unique characters
        String[] temp = s.split("");
        HashSet<String> dif = new HashSet<>(Arrays.asList(temp));
        ArrayList<String> difArrList = new ArrayList<>(dif);
        int max = 0;
        
        // Pairs each unique characters
        for (int i = 0; i < difArrList.size(); i++) {
            for (int j = i + 1; j < difArrList.size(); j++) {
                String a = difArrList.get(i);
                String b = difArrList.get(j);
                // Sends them and calculates the alternating length for the pair
                int alterLength = alternatingLength(s, a, b);
                
                if (alterLength > max) max = alterLength;
            }
        }
        
        return max;
    }

}

public class TwoCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = Result.alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
