package GeeksForGeeks.Arrays;

public class SecondLargestElement {



    public static int secondLargest(int[] arr, int len) {
        /*
         * Let's start new recursion
         * method
         * implement the recurion method
         */
        if (len != -1) {
            int temp;
            if (arr[len-1] > arr[len - 2]) {
                temp = arr[len-1];
                arr[len-1]=arr[len-2];
                arr[len-2]=temp;
                secondLargest(arr, len - 2);
            }else{


            }
        }

        return 0;
    }

    // helper method for recursion
    // public static int helper(int[] arr){

    // }


    public static int getSecondLargest(int[] a, int total){  
        int temp;  
        for (int i = 0; i < total; i++)   
                {  
                    for (int j = i + 1; j < total; j++)   
                    {  
                        if (a[i] > a[j])   
                        {  
                            temp = a[i];  
                            a[i] = a[j];  
                            a[j] = temp;  
                        }  
                    }  
                }  
               return a[total-2];  
        }  



    public static void main(String[] args) {
        int[] arr = {1,4,3,34,35};
        int len = 5;
      secondLargest(arr, len);
       // getSecondLargest(arr, len);

    }
    
}
