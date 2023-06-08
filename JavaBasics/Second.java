

public class Second  /*extends MyFirstJava  */{

    // consturctor
       // types of consturctors
       // 3 types 
        // no args / all args/ default 
        int a;
        int b;


        // method is a functionaltity we can implement the properties like variables
        public Second(int a, int b){
           
            this.a = a;
            this.b = b;
            int c = a+b;
        }





   // polymorphism
   // flexbilty
   
    public static void sub(int a, int b) {
        int sub = a - b;
        
        System.out.println("poly " + sub);
    }

    public static void sub(Double a, Double b) {
        Double sub = a - b;
        System.out.println("poly " + sub);
    }

}

/**
 * oops
 * abstration
 * hiding internal implemenation showing functionltity to the end user
 * 
 * abstract is a keyword it is used to partial implementation like class leve
 * and methods level
 * 
 * interface non-imp meth -> abstract class if all mthods are implemented no
 * need to write abstract keyword
 * if (non-impl) any one meth must we should use abstract keyword at class level
 * -> if we can extends orther calls
 * same story. happing when we will finish the implementaion.
 * 
 * @param args
 * 
 *             Key Points to Remember
 *             We use the abstract keyword to create abstract classes and
 *             methods.
 *             An abstract method doesn't have any implementation (method body).
 *             A class containing abstract methods should also be abstract.
 *             We cannot create objects of an abstract class.
 *             To implement features of an abstract class, we inherit subclasses
 *             from it and create objects of the subclass.
 *             A subclass must override all abstract methods of an abstract
 *             class. However, if the subclass is declared abstract, it's not
 *             mandatory to override abstract methods.
 *             We can access the static attributes and methods of an abstract
 *             class using the reference of the abstract class. For example,
 *             Animal.staticMethod();
 */
  class abst{
      private int a ;
      
      public setA(int a){

      }
      public return getA(){
          return A;
      }


      public method(){
         print getA();
      }
      
  }





   class Inner /* extends from Second */{
        // constructors can't inherted
         // y bcoz it as no object refs   it can automatically invoke 
        Second sc = new Second(a, b);


    }
    

