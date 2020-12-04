import java.util.Scanner;
class Rectangle {
   int width; int length;//Data members
   //Rectangle(){}//A constructor that reset all variable to zero
   /*
   //A constructor to initialize the class data members
Rectangle(){
    int width = 10;
    int length = 15;
}
*/
    //paramaeterized constructor
    Rectangle(int W,int I){
        width=W;
        length=I;
    } 
    //A method to set the width
    public void setWidth(int W){ width=W; }
    //A method to set length
    public void setLength(){ length=1; }
    //A method to get Width
    public int getWidth(){ return width; }
    //A method that get length
    public int getLength(){ return length; }
    //A method to calculate and return the area
    public int area(){ return getWidth()*getLength(); }
    //A method to calculate and get the perimeter
    public int perimeter(){ return 2*(getWidth()+getLength()); } 
}//End of Rectangle
//Class RectMain to implement the Rectangle class.
public class RectMain {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
  /*     
        //This section illustrate the use of the fisrt constructor( setting width = 10 and length=15)
        Rectangle r1 = new Rectangle();//creating an object r1 using the constructor witout parameters
        System.out.println("The area of the rectangle is " +r1.area());
        System.out.println("The perimeter of the rectangle is "+r1.perimeter());
        
        //This section illustrate the use of the parameterised consructor
        System.out.println("Enter the width");
        int wid=scan.nextInt();
        System.out.println("Enter the length");
        int len=scan.nextInt();
        Rectangle r2 = new Rectangle(wid,len);//Object r2using constructorwith parameters
        System.out.println("The area of the new rectangle is" +r2.area());
        System.out.println("The perimeter of the new rectangle is" +r2.perimeter());
        
        //Making use of setters
        System.out.println("Enter third length");
        int W = scan.nextInt();
        System.out.println("Enter third length");
        int I= scan.nextInt();
        Rectangle r3 = new Rectangle();//Object r3 using constructor with parameters
        //Reseting Object r3 width and length with the setters
        r3.setWidth(W);
        r3.setLength(I);
        System.outprintln("The area of the new rectangle is" +r3.area());
        System.out.println("The Perimeter of the rectangle is" +r3.perimeter());
*/
//Making use a method ObjectArea() that receives a rectangle and return its area
Rectangle r4 = new Rectangle();//Object r4 using construct parameters
r4.setWidth(10+(int)Math.ceil(Math.random()*45));
r4.setLength(3+(int)Math.ceil(Math.random()*25));
System.out.println("The width of the rectangle is"+r4.getWidth());
System.out.println("The Area of the rectangle is"+r4.getLength());
System.outprintln("The Area of the rectangle is" +objectArea(r4));
    }
}
