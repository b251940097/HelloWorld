package lab11;

import java.util.Scanner;

public class Rectangle implements Shape {
    private double a; 
    private double b; 
 
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
 
  
    public double calculateArea() {
        return a * b;
    }
 
 
    public void display() {
        System.out.printf("Талбайг нь тооцоолох дүрсийн нэрийг оруул: Rectangle%n");
        System.out.printf("Уртыг оруул (a): %.0f%n", a);
        System.out.printf("Өргөнийг оруул (b): %.0f%n", b);
        System.out.printf("Тэгш өнцөгтийн талбай (s=a*b) = %.2f%n%n", calculateArea());
    }
 
    public static Rectangle readFromConsole(Scanner sc) {
        System.out.print("Талбайг нь тооцоолох дүрсийн нэрийг оруул: Rectangle\n");
        System.out.print("Уртыг оруул (a): ");
        double a = sc.nextDouble();
        System.out.print("Өргөнийг оруул (b): ");
        double b = sc.nextDouble();
        return new Rectangle(a, b);
    }
}
