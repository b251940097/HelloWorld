package lab2;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 

        System.out.print("Монгол гэрийн радиусыг оруулна уу (R): ");
        double R = input.nextDouble();
 
        double busluur = 2 * Math.PI * R;
        System.out.printf("Монгол гэрт хэрэгтэй бүслүүрийн урт: %.2f метр%n%n", busluur);
 
   
        System.out.print("Эхний тоог оруулна уу: ");
        double a = input.nextDouble();
 
        System.out.print("Хоёрдугаар тоог оруулна уу: ");
        double b = input.nextDouble();
 
        double arithmeticMean = (a + b) / 2;
        double geometricMean  = Math.sqrt(a * b);
 
        System.out.printf("Арифметик дундаж: %.2f%n", arithmeticMean);
        System.out.printf("Геометр дундаж:   %.2f%n%n", geometricMean);
 
   
        System.out.println("Гурвалжны оройн координатуудыг оруулна уу:");
 
        System.out.print("A цэгийн x, y: ");
        double ax = input.nextDouble(), ay = input.nextDouble();
 
        System.out.print("B цэгийн x, y: ");
        double bx = input.nextDouble(), by = input.nextDouble();
 
        System.out.print("C цэгийн x, y: ");
        double cx = input.nextDouble(), cy = input.nextDouble();
 
     
        double sideA = Math.sqrt(Math.pow(bx - cx, 2) + Math.pow(by - cy, 2)); // BC
        double sideB = Math.sqrt(Math.pow(ax - cx, 2) + Math.pow(ay - cy, 2)); // AC
        double sideC = Math.sqrt(Math.pow(ax - bx, 2) + Math.pow(ay - by, 2)); // AB
 
        System.out.printf("%nГурвалжны талууд:%n");
        System.out.printf("  AB = %.2f%n", sideC);
        System.out.printf("  BC = %.2f%n", sideA);
        System.out.printf("  AC = %.2f%n", sideB);
 
      
        double s    = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
 
        System.out.printf("Гурвалжны талбай: %.2f%n", area);
 
        input.close();
    }
}
