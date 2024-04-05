public class UniqueCharacterString {

    public int FirstUniqCharacter(String s){
        int index = -1;

        for (char c : s.toCharArray()){
            if (s.indexOf(c) == s.lastIndexOf(c)){

                return index+1;
            }
            else {

                index += 1;
            }

        }


        return -1;

        }
    
}
