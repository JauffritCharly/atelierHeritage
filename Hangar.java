
public class Hangar {
    public static void main(String[] args) {
        
       Car car = new Car("porshe", 42000); 
       Boat boat = new Boat("Yamaha", 10000); 

       System.out.println(car.doStuff());
       System.out.println(boat.doStuff());
    }
}
