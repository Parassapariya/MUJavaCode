class Animal {  
    public void eat() {  
        System.out.println("Animal is eating.");  
    }  
}  
  
class Vehicle {  
    public void drive() {  
        System.out.println("Vehicle is being driven.");  
    }  
}  
  
class AnimalVehicle {  
    private Animal animal;  
    private Vehicle vehicle;  
      
    public AnimalVehicle() {  
        animal = new Animal();  
        vehicle = new Vehicle();  
    }  
      
    public void eat() {  
        animal.eat();  
    }  
      
    public void drive() {  
        vehicle.drive();  
    }  
}  
  
public class inh3 {  
    public static void main(String[] args) {  
        AnimalVehicle animalVehicle = new AnimalVehicle();  
        animalVehicle.eat(); // Output: Animal is eating.  
        animalVehicle.drive(); // Output: Vehicle is being driven.  
    }  
} 