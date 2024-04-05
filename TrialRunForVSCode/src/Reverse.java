public class Reverse {

    public int reverseString(int x){
        int reversed = 0;

        while (x>0){

            int digit = x%10;

            reversed = reversed*10 + digit;
            x=x/10;
        }


        return reversed;

    }
    
}
