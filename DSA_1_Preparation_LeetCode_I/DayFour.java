package DSA_1_Preparation_LeetCode_I;

import java.util.ArrayList;
import java.util.List;

public class DayFour {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row, pre=null;
        for(int i=0; i<numRows; ++i){
            row = new ArrayList<Integer>();
            for(int j=0; j<=i; ++j){
                if(j==0 || j==i){
                    row.add(i);
                }else{
                    row.add(pre.get(j-1)+pre.get(j));
                }
             
            }
        pre=row;
        res.add(row);
        }
        // for (List integer : res) {
        //     System.out.println(integer);
        // }
        
        return res;
    }

    public static void main(String[] args) {
        DayFour dayFour = new DayFour();
        dayFour.generate(5);
    }
    
}
