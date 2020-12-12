//Case 1: If SuperClass doesn’t declare any exception and subclass declare checked exception
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
  
    // method() declaring Checked Exception IOException 
    void method() throws IOException 
    { 
  
        // IOException is of type Checked Exception 
        // so the compiler will give Error 
  
        System.out.println("SubClass"); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        SuperClass s = new SubClass(); 
        s.method(); 
    } 
} 