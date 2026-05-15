package lab10;

public class Main {
    public static void main(String[] args) {
 
  
        Vehicle v = new Vehicle("Hyundai", "Tucson", 2021, "Цагаан", 2.0);
        v.info();
 
        System.out.println();
 

        Driver d1 = new Driver(
            "Toyota", "Camry", 2019,
            "Хар", 2.5,
            "DRV-001", "B",
            "1234УБА", "2020-06-15"
        );
        d1.info();
 
        System.out.println();
 
  
        Driver d2 = new Driver(
            "Lexus", "LX570", 2022,
            "Мөнгөлөг", 5.7,
            "DRV-002", "C",
            "9876УНА", "2022-11-03"
        );
        d2.info();
    }
}