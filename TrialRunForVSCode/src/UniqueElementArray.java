

public class UniqueElementArray {
    public int[] UniqueElement(int[] arr){

        int[] distinct = new int[20];
        int index = 0;

        for (int i = 0; i<arr.length; i++){
            int flag = 0;
            for (int j = 0 ; j< i; j++){

                if (arr[i] == arr[j]){
                    flag = 1;
                    break;
                }
            }

            if  (flag == 0){
                distinct[index] = arr[i];
                index++;
            }

        }

        return distinct;

    }
}
