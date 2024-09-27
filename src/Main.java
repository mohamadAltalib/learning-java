import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
       int[] digits = {1,2,3};

        int[] x = lengthOfLastWord(digits);
        for (int i : x){
            System.out.println(i);
        }

    }

     private static int[] lengthOfLastWord(int [] digits) {
         int index = 0;
         int length = digits.length;
         ArrayList<Integer> result = new ArrayList<>();
         int[] indexResult = new int[length + 1];

         if(length == 1 && digits[0] == 9){
             digits = new int[]{1, 0};
             return digits;
         }else if(length == 1){
             digits[0] +=1;
             return digits;
         }



         for(int i = length - 1; i >= 0; i--){
             if(digits[i] != 9){
                 index = i;
                 break;
             }
         }

         if(index == 0 && digits[0] == 9){
             indexResult[0] = 1;
             for(int i = 1; i <indexResult.length; i++){
                 indexResult[i] = 0;
             }
             digits = indexResult;
             return digits;

         }

         for(int i = length - 1; i > index ; i--){
             digits[i] = 0;
         }

         digits[index] += 1;

         return  digits;
     }

}
