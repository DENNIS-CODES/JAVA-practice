//This example initializes enum using a costructor & getPrice() method & display values of enums.
enum Car {
   lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
   private int price;
   Car(int p) {
      price = p;
   }
   int getPrice() {
      return price;
   } 
}
public class Main {
   public static void main(String args[]){
      System.out.println("All car prices:");
      for (Car c : Car.values()) System.out.println(
         c + " costs " + c.getPrice() + " thousand dollars.");
   }
}