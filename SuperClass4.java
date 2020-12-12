//Case 4: If SuperClass declares an exception and SubClass declares an child exception of the SuperClass declared Exception.
import java.io.*; 
  
class SuperClass4 { 
  
    // SuperClass declares an exception 
    void method() throws RuntimeException 
    { 
        System.out.println("SuperClass"); 
    } 
} 
  
// SuperClass inherited by the SubClass 
class SubClass extends SuperClass { 
  
    // SubClass declaring a child exception 
    // of RuntimeException 
    void method() throws ArithmeticException 
    { 
  
        // ArithmeticException is a child exception 
        // of the RuntimeException 
        // So the compiler won't give an error 
        System.out.println("SubClass"); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        SuperClass s = new SubClass(); 
        s.method(); 
    } 
} 