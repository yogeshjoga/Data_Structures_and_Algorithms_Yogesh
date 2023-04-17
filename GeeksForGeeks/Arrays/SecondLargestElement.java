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

        int print2largest(int arr[], int n) {
            int temp;
            for(int i=0; i<n-1; i++){
                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    i= -1;
                }
            }
          return arr[n-2];
        }

        /*
         * this is the actuall problem  with solution 
         * without sorting the array 
         * finding the second largest element 
         * lets see the algo
         */
      public static int print2largest2(int arr[], int n) {
            int prev = -1;
            int max = arr[0];
            for(int i=1; i<arr.length; i++){
                if(arr[i] > max){
                    prev = max;
                    max = arr[i];
                }
                else if(arr[i] < max && prev<arr[i]){
                    prev = arr[i];
                }
            }
            return prev;
          }


    public static void main(String[] args) {
        int[] arr = {1,4,3,34,35};
        int len = 5;
    //  secondLargest(arr, len);
       // getSecondLargest(arr, len);
       print2largest2(arr, len);
    }
    
}
