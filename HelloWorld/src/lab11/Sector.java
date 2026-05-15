package lab11;



import java.util.Scanner;

public class Sector implements Shape {
    private double r;     
    private double angle;

    public Sector(double r, double angle) {
        this.r = r;
        this.angle = angle;
    }

 
    public double calculateArea() {
        return 0.5 * r * r * Math.toRadians(angle);
    }


    public void display() {
        System.out.printf("Талбайг нь тооцоолох дүрсийн нэрийг оруул: Sector%n");
        System.out.printf("Радиусыг оруул (r): %.0f%n", r);
        System.out.printf("Өнцгийг оруул (angle°): %.0f%n", angle);
        System.out.printf("Секторын талбай (s=0.5*r²*θ) = %.2f%n%n", calculateArea());
    }

    public static Sector readFromConsole(Scanner sc) {
        System.out.print("Талбайг нь тооцоолох дүрсийн нэрийг оруул: Sector\n");
        System.out.print("Радиусыг оруул (r): ");
        double r = sc.nextDouble();
        System.out.print("Өнцгийг оруул (angle°): ");
        double angle = sc.nextDouble();
        return new Sector(r, angle);
    }
}
