package module07._2constructor;

public class Car
{
   //  instance variables
   private String model;
   private int year;
   
   // constructor: set instance variables to default values
   public Car()
   {
      // 1. set the instance variables to default values "" and 2019
      model = "";      // default model
      year = 2019;
   }
   
   // constructor: set instance variables to init parameters
   public Car(String initModel, int initYear)
   {
      // 2. set the instance variables to the init parameter variables
      model = initModel;
      year = initYear;
   
   }
   
   // Print Car info
   public void print()
   {
     System.out.println("Car model: " + model);
     System.out.println("Car year: " + year);
   }
   
   // main method for testing
   public static void main(String[] args)
   {
      // 3. call the constructor to create 2 new Car objects using the 2 constructors. car1 will be the default values. car2 should be a Honda 2010 car.
      Car car0 = new Car();
      Car car1 = new Car("Toyota Camri", 2025);
      Car car2 = new Car("Volswagon Bug",2007);
      
      car0.print();
      car1.print();
      car2.print();

   }
}
