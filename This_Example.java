public class This_Example {
    //Instance variable num
    int num=10;
    This_Example(){
        System.out.println("This is an Example program on keyword this ");
    }
    This_Example(int num){
        this();//Invoking the default constructor
        //Assining the local variable num to the instance variable num
        this.num=num;
    }
    public void greet(){
        System.out.println("Hi Welcome to java Programming");
    }
    public void greet(){
        //Local variable num
        int num=20;
        //printing the local variable
        System.out.println("value of local variable num is : "+num);
        //Printing the instance variable
        System.out.println("value of instance variable num is : "+this.num);
        //Invoking the greet method of a class
        this.greet();
    }
    public static void main(String[] args) {
        //instanciating the class
        This_Example obj1=new This_Example();
        //Invoking the print method
        obj1.print();
        //Passing a new value to the num variable through parameterized constructors
        This_Example obj2=new This_Example(30);
        //Invoking the print method again
        obj2.print();

    }
    
}
