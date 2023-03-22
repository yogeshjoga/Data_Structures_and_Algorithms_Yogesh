package Data_Structers.Arrays;

public class TwoSum {
    public int[] twoSums(int[] nums, int target){
        int arrNums = nums.length;
        int[] result = new int[2];
        for(int i=0; i<=arrNums; i++){
            for(int j=i+1; j<arrNums; j++){
                if(nums[i]+ nums[j] == target){
                    System.out.println(nums[i]+",  "+nums[j]+"  =  "+target);
                    result[0]=i;
                    result[1]=j;
                    // for printing the arry index 
                    for (int hello : result) {
                        System.out.print(hello+" ");
                    }
                    
                    
                }
            }
            
        }
        System.out.print("---> indexPositions");

         return result;
    }
    
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2,3,4,5,6};
        int target = 9;
        twoSum.twoSums(nums,target);

    }
}
