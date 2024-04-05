
import java.util.Scanner;








public class App {
    public static void main(String args[]) {

        //\\ 1. Reverse a string //\\
        // Solution obj = new Solution();
        // Scanner sc = new Scanner(System.in);
        // String s2 = sc.nextLine();
        // char[] s3 = s2.toCharArray();
        // char[] s1 = {'h','e','l','l','o'};
        // obj.reverseString(s1);
        // obj.reverseString(s3);
        // System.out.println(s1);
        // System.out.println(s3);
        // sc.close();


        //\\2.  Reverse an integer //\\
        // Reverse reverseObject = new Reverse();
        // Scanner scan =  new Scanner(System.in);
        // int number  = scan.nextInt();
        // reverseObject.reverseString(number);
        // System.out.println(reverseObject.reverseString(number));


        //\\ 3. First unique character in a string //\\
        // UniqueCharacterString obj = new UniqueCharacterString();
        // Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // System.out.println(obj.FirstUniqCharacter(s));
        // int i = obj.FirstUniqCharacter(s);
        // char[] ch = s.toCharArray();
        // System.out.println(ch[i]);
        // sc.close();


        //\\ 4.  Valid Anagrams in a string //\\
        // Scanner sc = new Scanner(System.in);
        // String s1= sc.nextLine();
        // String s2 = sc.nextLine();
        // ValidAnagram obj = new ValidAnagram();
        // System.out.println(obj.ValidAnagramI(s1, s2));

        //\\ 5. Valid String Palindrome //\\
        // Scanner sc = new Scanner(System.in);
        // String sentence = sc.next();
        // ValidPalindrome obj = new ValidPalindrome();

        // System.out.println(obj.isValidPalindrome(sentence));


        //\\ 6. Count of Alphabets in a string //\\
        // CountAlphabetsString obj = new CountAlphabetsString();
        // String input = "I love palakkad";
        // obj.countAlphabets(input);



        //\\ 7. Needle in a Haystack
        // NeedleHaystack obj = new NeedleHaystack();
        // Scanner sc = new Scanner(System.in);
        // String haystack = sc.nextLine();
        // String needle = sc.nextLine();

        // System.out.println(obj.needleAndHaystack(haystack, needle));

        //\\ 8 . Largest Common prefix
        // LCP obj = new LCP();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the String Array: ");
        // int size = sc.nextInt();
        // String[] strs = new String[size];
        // System.out.println("Enter the elements of the array :");
        // for (int i = 0; i < size; i++){
        //     strs[i] = sc.nextLine(); 
        // }
        // System.err.println("Largest Common Prefix: "+obj.largestCommonPrefix(strs));


        //\\ 9. Distinct elements in an array

        UniqueElementArray obj = new UniqueElementArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements of the Array: ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        int[] distinctArray = (obj.UniqueElement(arr));
        int newSize = distinctArray.length;
        
        for (int j=0;j<newSize;j++){
            if(distinctArray[j] != 0){
            System.out.print("Distinct Elements are: "+distinctArray[j]);
            }
        }
   




    } 
}


