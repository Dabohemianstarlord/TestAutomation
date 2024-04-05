public class CountAlphabetsString {


    public static void countAlphabets(String input) {
        input = input.toLowerCase(); // Convert the string to lowercase to handle both uppercase and lowercase characters

        // Array to store the count of each alphabet from 'a' to 'z'
        int[] count = new int[26];

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.println("Characters: "+ch);
            if (Character.isLowerCase(ch) && ch >= 'a' && ch <= 'z') {
                // Increment the count for the corresponding alphabet
                count[ch - 'a']++;
                System.out.println("count: "+count[ch - 'a']);
            }
        }

        // Print the count of each alphabet
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + ": " + count[ch - 'a']);
        }
    }
}
    

