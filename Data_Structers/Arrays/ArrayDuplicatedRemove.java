package Data_Structers.Arrays;

import java.util.Arrays;

public class ArrayDuplicatedRemove {

        public int removeDuplicateArray(int[] nums){
            Arrays.sort(nums);
            for(int i=0; i<nums.length; i++){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[i] == nums[j]){
                        
                    }
                }
            }       
            return 1;
        }

        public int removeArray(int[] nums) {
            // lets understand this
            Arrays.sort(nums);
            int i = nums.length > 0 ? 1 : 0;
            for (int n : nums)
                if (n > nums[i - 1])
                    nums[i++] = n;
        
            return i;

        }



    public static void main(String[] args) {
        
        ArrayDuplicatedRemove arrayDuplicatedRemove = new ArrayDuplicatedRemove();
        int[] nums ={1,1,2,2,3,4,5,3,4,6};
      //  arrayDuplicatedRemove.removeDuplicateArray(nums);
        arrayDuplicatedRemove.removeArray(nums);
        for (int i : nums) {
            System.out.println(i);
        }


        
    }
    
}
