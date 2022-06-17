import java.util.Scanner;

public class MyFirstJava{
   // two types of variables
    // global variabales 
    // local 

    int a = 10;
    // hard coding 
    double b = 20;
    //cold coding 
    String myName;

    //method static and non-static

    public  int add(){
        // local variable add;
        int add = this.a + (int)b;
        System.out.println("add method"+add);
        return add;
    }
// method overloading
    public static void main(int a , int b){
        int add = a+ b;
        System.out.println("this is main "+add);
    }

    // static method overriding
    public static void sub(int a, int b){
        int sub = a-b;
        System.out.println("this is from sub static method"+sub);
    }

    public static void main(String[] args) {


        // public it access the all root and child packages
        // STatic it automatically loades a class loader
        // void it wont returning anything
        // main is method name  we can modifi also
        // String is the universal datatype we will convert any object type or primitive type



        MyFirstJava mfj = new MyFirstJava();
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a value");
        int a = sc.nextInt();
        int b = sc.nextInt();
        main(a, b);
        sub(a, b);
        mfj.add();
    }
    /**
     * 53
     * 
     * 8 datatypes
     * 11 modifiers
     * 11 flow controls (for, while, do, if , else, default, contiune, breake)
     * 
     * 6  exception handling
     * try
     * catch
     * throw
     * throws
     * finally
     */

     /**
      * compiler time / early binding ex: method overloading
       * run time / late binding ex: method overriding
       * 
       * 
       *  can we override the static method.
       *   no! if we can override the static method it is called data hiding.
      */


}