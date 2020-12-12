// Case 2: If SuperClass doesn’t declare any exception and SubClass declare Unchecked exception
import java.io.*; 
  
class SuperClass { 
  
    // SuperClass doesn't declare any exception 
    void method() 
    { 
        System.out.println("SuperClass"); 
    } 
} 
  
// SuperClass inherited by the SubClass 
class SubClass extends SuperClass { 
  
    // method() declaring Unchecked Exception ArithmeticException 
    void method() throws ArithmeticException 
    { 
  
        // ArithmeticException is of type Unchecked Exception 
        // so the compiler won't give any error 
  
        System.out.println("SubClass"); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        SuperClass s = new SubClass(); 
        s.method(); 
    } 
} 