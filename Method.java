

public class Method {
    public static void main(String args[]) {
        //creating object of Base class shape
        //if a parent type reference refers to a parent object then
        //parents draw() method is called
        Shape obj = new Shape();
        obj.draw();
        //if a parent type reference refers to a child object childs
        //draw() method is called.
        //This is called Run Time Polymorphism.
        Shape obj1=new Circle();
        obj1.draw(); 
    }
    
}
