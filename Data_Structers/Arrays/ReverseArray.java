package Data_Structers.Arrays;

public class ReverseArray {

    /*
     * we don't have arrays knowledge 
     * fuckkkkkkk
     * reverse array
     * 
     */


    //  public static int[] reverseArray(int[] array){

    //     int[] rev;
    //     int len = array.length-1;

    //       rev =  rev1(array,len);

    //     return rev;
    //  }

    //  public static int[] rev1(int[] arry, int posi){
    //     int[] revArr;
    //     int a =0;
    //     if(posi>=0){
    //         revArr[a]=arry[posi];
    //         a++;
    //         rev1(arry,posi-1);
    //     }
    //     retrun revArr;

    //  }

    public static void reverseArray(int[] array){
        int len =array.length-1;
       rev(array,0,len);
    }
    public static void rev(int[] array, int i, int j){

       
        if(i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j]= temp;
            rev(array,++i,--j);
        }
       
    }
    public static void main(String[] args) {
        int [] hello ={1,2,3,4};
        reverseArray(hello);
    }
    
}
