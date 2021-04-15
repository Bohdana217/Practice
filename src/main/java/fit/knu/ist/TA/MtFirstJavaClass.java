/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit.knu.ist.TA;

/**
 *
 * @author admin
 */
public class MtFirstJavaClass {
  
    private int myInt;
    private static int myStaticInt;
    
    
    
    
    public MtFirstJavaClass() {
        
    }

    public MtFirstJavaClass(int myInt) {
        this.myInt = myInt;
    }

    public static int getMyStaticInt() {
        return myStaticInt;
    }

    public static void setMyStaticInt(int aMyStaticInt) {
        myStaticInt = aMyStaticInt;
        
    }
    
  
    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    @Override
    public String toString() {
        return "MtFirstJavaClass{" + "myInt=" + myInt + '}';
    }
    
     public static String toStringStatic() {
        return "MtFirstJavaClass{" + "myStaticInt=" + myStaticInt + '}';
    }
    
}
