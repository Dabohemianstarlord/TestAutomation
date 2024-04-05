public class ValidPalindrome {
    public boolean isValidPalindrome(String s){

        String cleanedString =  s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        return cleanedString.equals(new StringBuilder(cleanedString).reverse().toString());
    }
}
