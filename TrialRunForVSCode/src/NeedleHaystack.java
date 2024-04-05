public class NeedleHaystack {
    public int needleAndHaystack(String haystack, String needle){

        if (needle.isEmpty()){
            return -1;
        }

        for (int i=0; i <= haystack.length()-needle.length();i++){

            if (haystack.substring(i, i+ needle.length()).equals(needle)){

                return i;
            }

        }

        return -1;

    

    }
}
