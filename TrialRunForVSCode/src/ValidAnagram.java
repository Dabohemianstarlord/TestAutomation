
import java.util.Arrays;

public class ValidAnagram {
    
    public boolean ValidAnagramI(String s, String t){

        if (s.length() != t.length()){
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);
        System.out.println(sArray);
        System.err.println(tArray);

        return Arrays.equals(sArray, tArray);

        
    }
}
