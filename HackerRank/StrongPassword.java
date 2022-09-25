import java.io.*;
import java.util.*;

class Result {
    public static int minimumNumber(int n, String password) {
        List<Boolean> ans = new ArrayList<>(Arrays.asList(new Boolean[4]));
        Collections.fill(ans, Boolean.FALSE);
        String special_characters = "!@#$%^&*()-+";
        for(int i = 0; i < password.length(); i++){
            if(Character.isLowerCase(password.charAt(i))) ans.set(0, true);
            if(Character.isUpperCase(password.charAt(i))) ans.set(1, true);
            if(Character.isDigit(password.charAt(i))) ans.set(2, true);
            if(special_characters.contains(String.valueOf(password.charAt(i)))) ans.set(3, true);
        }
        
        return Math.max(Collections.frequency(ans, false), 6 - password.length());
    }

}

public class StrongPassword {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
