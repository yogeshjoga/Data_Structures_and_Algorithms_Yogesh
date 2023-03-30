package Data_Structers.Recursion_and_BackTracking;


public class HelloRe {
    

    /*
     * recursion printing numbers
     * 
     */

     public static int hello(int n){
       // System.out.println(n);
        if(n != 0){
            System.out.println(n);
            hello(n-1);
        }
        return 0;
     }





     public static void main(String[] args) {
        int n =10;
        hello(n);
        
     }
}
