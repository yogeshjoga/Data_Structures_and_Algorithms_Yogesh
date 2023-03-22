package Programmming_skills_LeetCode;

import java.util.Arrays;

public class DayOne {
    // this is accepted but Time Limite exceed! Not valid solution
    public int countOdds(int low, int high) {
        int count = 0;
        for(int i=low; i<=high; i++){
            if(i%2!=0){
            count++;
            }
        } 
        return count;
    }
 
    public int countOdds1(int low, int high) {
        if(low % 2 == 0 && high % 2 == 0){
            return (high-low) /2;
        }
         return (high-low) / 2+1;
     }

     // day one 2nd question
     public double average(int[] salary) {
        Arrays.sort(salary);
        double total = 0;
        int len = salary.length;
        for(int i=0; i<len; i++){
            total = total + salary[i];
        }
        System.out.println(total/len);
       return (total/(salary.length-2));
    }

    public double average2(int[] salary) {
        final int N = salary.length;
        Arrays.sort(salary);
       double t = salary[1];
        for (int i = 2; i < N - 1; i++) {
            t += salary[i];
        }
        System.out.println(t / (N - 2));
        return t / (N - 2);
    }


    public static void main(String[] args) {
        int[] salary ={8000,9000,2000,3000,6000,1000};
        DayOne dayOne = new DayOne();
      dayOne.average(salary);
      //  dayOne.average2(salary);
    }
}
