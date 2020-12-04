class Shape {
    void draw()
    {
        System.out.println("Inside the method of Parent class");
        System.out.println("Drawing Shapes");
    }
}
//Derived class
class Circle extends Shape {
    //overriding method of base class with different implementation
    void draw(){
        System.out.println("Inside the overriden method of a child class");
        System.out.println("Drawing Circle");
    }
}
