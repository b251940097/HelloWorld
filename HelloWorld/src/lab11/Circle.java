package lab11;

import java.util.Scanner;

public class Circle implements Shape {
    private double r; 
 
    public Circle(double r) {
        this.r = r;
    }
 
   
    public double calculateArea() {
        return Math.PI * r * r;
    }
 
   
    public void display() {
        System.out.printf("Талбайг нь тооцоолох дүрсийн нэрийг оруул: Circle%n");
        System.out.printf("Радиусыг оруул (r): %.0f%n", r);
        System.out.printf("Тойргийн талбай (s=π*r*r) = %.2f%n%n", calculateArea());
    }
 
    public static Circle readFromConsole(Scanner sc) {
        System.out.print("Талбайг нь тооцоолох дүрсийн нэрийг оруул: Circle\n");
        System.out.print("Радиусыг оруул (r): ");
        double r = sc.nextDouble();
        return new Circle(r);
    }
}
