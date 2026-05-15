package lab10;

public class Vehicle {
   
    protected String марк;        
    protected String загвар;      
    protected int үйлдвэрлэсэнОн;
    protected String өнгө;
    protected double хөдөлгүүрийнБагтаамж; 
 
 
    public Vehicle(String марк, String загвар, int үйлдвэрлэсэнОн, String өнгө, double хөдөлгүүрийнБагтаамж) {
        this.марк = марк;
        this.загвар = загвар;
        this.үйлдвэрлэсэнОн = үйлдвэрлэсэнОн;
        this.өнгө = өнгө;
        this.хөдөлгүүрийнБагтаамж = хөдөлгүүрийнБагтаамж;
    }
  
  
    protected String getFullName(String марк, String загвар) {
        return марк + " " + загвар;
    }
 

    protected int getYear(String date) {
        return Integer.parseInt(date.split("-")[0]);
    }
 
    protected int getMonth(String date) {
        return Integer.parseInt(date.split("-")[1]);
    }
 
    protected int getDay(String date) {
        return Integer.parseInt(date.split("-")[2]);
    }
 
   
    protected void info() {
        System.out.println("Тээврийн хэрэгслийн мэдээлэл ");
        System.out.println("Марк, загвар    : " + getFullName(марк, загвар));
        System.out.println("Үйлдвэрлэсэн он : " + үйлдвэрлэсэнОн);
        System.out.println("Өнгө             : " + өнгө);
        System.out.println("Хөдөлгүүр        : " + хөдөлгүүрийнБагтаамж + "L");
    }
}