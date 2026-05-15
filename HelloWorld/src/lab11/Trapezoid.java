package lab11;

import java.util.Scanner;

public class Trapezoid implements Shape {
    private double a; 
    private double b; 
    private double h; 
 
    public Trapezoid(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }
 
 
    public double calculateArea() {
        return 0.5 * (a + b) * h;
    }
 
  
    public void display() {
        System.out.printf("Талбайг нь тооцоолох дүрсийн нэрийг оруул: Trapezoid%n");
        System.out.printf("Дээд суурийг оруул (a): %.0f%n", a);
        System.out.printf("Доод суурийг оруул (b): %.0f%n", b);
        System.out.printf("Өндрийг оруул (h): %.0f%n", h);
        System.out.printf("Трапецийн талбай (s=0.5*(a+b)*h) = %.2f%n%n", calculateArea());
    }
 
    public static Trapezoid readFromConsole(Scanner sc) {
        System.out.print("Талбайг нь тооцоолох дүрсийн нэрийг оруул: Trapezoid\n");
        System.out.print("Дээд суурийг оруул (a): ");
        double a = sc.nextDouble();
        System.out.print("Доод суурийг оруул (b): ");
        double b = sc.nextDouble();
        System.out.print("Өндрийг оруул (h): ");
        double h = sc.nextDouble();
        return new Trapezoid(a, b, h);
    }
}