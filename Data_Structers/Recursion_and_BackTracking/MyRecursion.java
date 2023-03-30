package Data_Structers.Recursion_and_BackTracking;

public class MyRecursion {
/*
 *  Recursion
 *  Lets understand the Recursion function
 *  Ntg But selfCalling method
 * lets print some statements by using Recurion Algo
 */
    
public static int recursionPrint(int len){
    if(len != 0){
        System.out.println("Hello programer");
        return recursionPrint(len-1);
    }
    return len;
}

public static int recursionPrint1(int len){
    int i =0;

   int n = ( (len == i)? 2:recursionPrint1(len-1));
   System.out.println(n);
   //int n = ( (len != i)? 3:return recursionPrint1(len-1));
    if(len != 0){
        System.out.println("Hello programer");
        return recursionPrint(len-1);
    }
    return len;
}


/*
 * factorial
 * the math formula is n*(n-1)
 * okay lets solve it
 * NOTE: if you do * multiplications opertions variable must be iniate with 1
 *       if you + addition iniate with 0, orther wise you getting code currption
 * okay lets solve indetph of recurison problems
 */
public static int factroialNum(int n){
    if(n <= 1){
        return 1;
    }
    return n * factroialNum(n-1);
}
 public static void main(String[] args) {

    int len =5;
  //  recursionPrint1(len);
    int n =factroialNum(len);
    System.out.println(n);
    
 }
}
