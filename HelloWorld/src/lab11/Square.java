package lab11;

import java.util.Scanner;

public class Square implements Shape {
    private double a; 
 
    public Square(double a) {
        this.a = a;
    }
 
  
    public double calculateArea() {
        return a * a;
    }
 
   
    public void display() {
        System.out.printf("Талбайг нь тооцоолох дүрсийн нэрийг оруул: Square%n");
        System.out.printf("Талын урт оруул (a): %.0f%n", a);
        System.out.printf("Квадратын талбай (s=a*a) = %.2f%n%n", calculateArea());
    }
 
  
    public static Square readFromConsole(Scanner sc) {
        System.out.print("Талбайг нь тооцоолох дүрсийн нэрийг оруул: Square\n");
        System.out.print("Талын урт оруул (a): ");
        double a = sc.nextDouble();
        return new Square(a);
    }
}
