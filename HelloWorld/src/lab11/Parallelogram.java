package lab11;
 
import java.util.Scanner;
 
public class Parallelogram implements Shape {
    private double a; 
    private double h; 
 
    public Parallelogram(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double calculateArea() {
        return a * h;
    }
 
 
    public void display() {
        System.out.printf("Талбайг нь тооцоолох дүрсийн нэрийг оруул: Parallelogram%n");
        System.out.printf("Суурийг оруул (a): %.0f%n", a);
        System.out.printf("Өндрийг оруул (h): %.0f%n", h);
        System.out.printf("Параллелограмын талбай (s=a*h) = %.2f%n%n", calculateArea());
    }
 
    public static Parallelogram readFromConsole(Scanner sc) {
        System.out.print("Талбайг нь тооцоолох дүрсийн нэрийг оруул: Parallelogram\n");
        System.out.print("Суурийг оруул (a): ");
        double a = sc.nextDouble();
        System.out.print("Өндрийг оруул (h): ");
        double h = sc.nextDouble();
        return new Parallelogram(a, h);
    }
}

