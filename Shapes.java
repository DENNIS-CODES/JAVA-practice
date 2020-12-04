//Upcasting and Polymorphisim
class Square extends Shape {
    void draw() {
        System.out.println("Square.draw()");
    }
    void erase() {System.out.println("Square.erase");}}
class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle.draw()");
    }
    void erase() {System.out.println("Triangle.erase()");}
}

public class Shapes {
    public static Shape randShape() {
        switch((int) (Math.random()*3)) {
            case 0: return new Cicrle();
            case 1: return new Square();
            case 2: return new Triangle();
            default: return new Circle();

        }
    }
    public static void main(String[]args) {
        Shapes[] s= new Shape[9];
        for (int i = 0; i < s.length; i++)
        s[i] = randShape();
        //make polymorphism method calls:
        for (int i = 0; i < s.length; i++)s[i].draw();
    }
}