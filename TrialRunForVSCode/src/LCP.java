public class LCP {

    public String largestCommonPrefix(String[] strs){

        if (strs == null || strs.length == 0){

            return "";
        }

        String lcp = strs[0];

        for (int i = 1; i<strs.length; i++){

            String current = strs[i];

            int j = 0;

            while (j < lcp.length() && j < current.length() && lcp.charAt(j) == current.charAt(j)){
                j++;
            }

            lcp = lcp.substring(0,j);

            if (lcp.isEmpty()){
                break;
            }
        }

        return lcp;


    }
    
}
