package Data_Structers.Arrays;


public class SearchInserctionPostion {

    // test code
    public int searchPosition(int[] nums, int target){
        int i,t=0;
        for(i=0; i<nums.length; i++){
            if(nums[i] >= target){
                t++;
                System.out.println("i value index positon : "+i);
                if(t==1){
                    break;
                }
            }
        }
        // itrating the values
        for (int arr : nums) {
            System.out.println(arr);
        }
        // inserction the number
        for(int k=0; k<nums.length; k++){
            if(nums[k] == 2){
                System.out.println("number added position : "+ nums[k]+" number : "+ target);
            }
        }

        return i;
    }

    /*
     * let's implement the actuall code to insertion the number position
     * 
     */
    public int inserctionNum(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i] >=  target){
                System.out.println(i);
                return i;
                
            }
        }
        return nums.length;
    }


    public static void main(String[] args) {
        SearchInserctionPostion searchInserctionPostion = new SearchInserctionPostion();
        int[] arr = {1,2,4,5};
        int target = 3;
      //  searchInserctionPostion.searchPosition(arr, target);
        searchInserctionPostion.inserctionNum(arr,target);
        
    }
    
}
