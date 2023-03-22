package Data_Structers.Array_Linear_Binary_Searching_algo;

import java.util.Arrays;

public class LinearSearch {

    public static boolean linearSearch(int[] arr, int key){
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*
         * Let's search the one key in a given array
         *  -- array, int key
         */

         int[] arr = {12,11,1,2,3,4,2,7,8,99,88,67,54,345,2323,443,0};
         int key = 443;
       //  System.out.println(linearSearch(arr, key));
        if(linearSearch( arr, key) == true){
            System.out.println("your number is there! ");
        }else{
            System.out.println(" your key number is not there! ");
        }
    }
    
}
