// Java program to demonstrate ArithmeticException 
class ArithmeticException_Demo 
{ 
    public static void main(String args[]) 
    { 
        try { 
            int a = 30, b = 0; 
            int c = a/b;  // cannot divide by zero 
            System.out.println ("Result = " + c); 
        } 
        catch(ArithmeticException e) { 
            System.out.println ("Can't divide a number by 0"); 
        } 
    } 
}

//Java program to demonstrate NullPointerException 
class NullPointer_Demo 
{ 
    public static void main(String args[]) 
    { 
        try { 
            String a = null; //null value 
            System.out.println(a.charAt(0)); 
        } catch(NullPointerException e) { 
            System.out.println("NullPointerException.."); 
        } 
    } 
}

// Java program to demonstrate StringIndexOutOfBoundsException 
class StringIndexOutOfBound_Demo 
{ 
    public static void main(String args[]) 
    { 
        try { 
            String a = "This is like chipping "; // length is 22 
            char c = a.charAt(24); // accessing 25th element 
            System.out.println(c); 
        } 
        catch(StringIndexOutOfBoundsException e) { 
            System.out.println("StringIndexOutOfBoundsException"); 
        } 
    } 
}

//Java program to demonstrate FileNotFoundException 
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
 class File_notFound_Demo { 
  
    public static void main(String args[])  { 
        try { 
  
            // Following file does not exist 
            File file = new File("E://file.txt"); 
  
            FileReader fr = new FileReader(file); 
        } catch (FileNotFoundException e) { 
           System.out.println("File does not exist"); 
        } 
    } 
} 
