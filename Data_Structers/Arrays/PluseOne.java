package Arrays;

public class PluseOne {

    /*
     * if last digit is 9, return the num is 1,0
     */

    public int[] testSolution(int[] nums){
        /*
         * little crazy about this question
         * 
         */
        int[] arr= new int[nums.length+1];

        if(nums[nums.length-1] == 9){
            
            arr = nums;
            arr[nums.length-1] = 1;

            nums[nums.length-1] = 1;
            nums[nums.length-1] = 0;
        }else{
            nums[nums.length-1] =  nums[nums.length-1]+1;
        }
     //   nums[nums.length-1] =  nums[nums.length-1]+1;


        // int plus;
        // for(int i=0; i<nums.length-1; i++){
        //     //1234
        //     plus = nums[nums.length-1]+1;
        //     nums[nums.length-1] =  nums[nums.length-1]+1;
        //     System.out.println(plus);
        // }
       // int[] solution = new int[nums];
      // List<Integer> sol = new ArrayList<>(nums);
      //  int[] result = new int[nums.length];

      for (int i : nums) {
        System.out.println(i);
      }

      for (int i : arr) {
        System.out.println(i);
        
      }
        

        return nums;
    }

    public int[] solution(int[] nums){
        
            int n = nums.length;
             for(int i=n-1; i>=0; i--) {
                 if(nums[i] < 9) {
                    nums[i]++;
                     return nums;
                 }
                 nums[i] = 0;
             }
             int[] newNumber = new int [n+1];
             newNumber[0] = 1;
             return newNumber;
         
         
    }

    public static void main(String[] args) {
        PluseOne pluseOne = new PluseOne();
        int[] nums = {1,2,3,4,5,9};
        pluseOne.testSolution(nums);
        pluseOne.solution(nums);
    }
    
}