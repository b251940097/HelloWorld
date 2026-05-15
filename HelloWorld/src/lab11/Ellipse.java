package lab11;

import java.util.Scanner;

public class Ellipse implements Shape {
    private double a; 
    private double b; 

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public double calculateArea() {
        return Math.PI * a * b;
    }

   
    public void display() {
        System.out.printf("Талбайг нь тооцоолох дүрсийн нэрийг оруул: Ellipse%n");
        System.out.printf("Том тэнхлэгийг оруул (a): %.0f%n", a);
        System.out.printf("Жижиг тэнхлэгийг оруул (b): %.0f%n", b);
        System.out.printf("Эллипсийн талбай (s=π*a*b) = %.2f%n%n", calculateArea());
    }

    public static Ellipse readFromConsole(Scanner sc) {
        System.out.print("Талбайг нь тооцоолох дүрсийн нэрийг оруул: Ellipse\n");
        System.out.print("Том тэнхлэгийг оруул (a): ");
        double a = sc.nextDouble();
        System.out.print("Жижиг тэнхлэгийг оруул (b): ");
        double b = sc.nextDouble();
        return new Ellipse(a, b);
    }
}
