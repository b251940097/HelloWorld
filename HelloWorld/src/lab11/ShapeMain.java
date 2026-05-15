package lab11;
 
import java.util.Scanner;
 
public class ShapeMain {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("=== Дүрсийн талбай тооцоолох программ ===");
        System.out.println("Дүрсүүд: square, rectangle, triangle, trapezoid,");
        System.out.println("         circle, sector, ellipse, parallelogram");
        System.out.println("Гарахын тулд: exit");
       
 
        while (true) {
            System.out.print("Талбайг нь тооцоолох дүрсийн нэрийг оруул: ");
            String name = sc.next().trim().toLowerCase();
 
            if (name.equals("exit")) {
                System.out.println("Программаас гарлаа.");
                break;
            }
 
           
            Shape shape = null;
 
            switch (name) {
                case "square":
                    System.out.print("Талын урт оруул (a): ");
                    double a = sc.nextDouble();
                    shape = new Square(a);
                    break;
 
                case "rectangle":
                    System.out.print("Уртыг оруул (a): ");
                    double ra = sc.nextDouble();
                    System.out.print("Өргөнийг оруул (b): ");
                    double rb = sc.nextDouble();
                    shape = new Rectangle(ra, rb);
                    break;
 
                case "triangle":
                    System.out.print("Суурийг оруул (a): ");
                    double ta = sc.nextDouble();
                    System.out.print("Өндрийг оруул (h): ");
                    double th = sc.nextDouble();
                    shape = new Triangle(ta, th);
                    break;
 
                case "trapezoid":
                    System.out.print("Дээд суурийг оруул (a): ");
                    double tra = sc.nextDouble();
                    System.out.print("Доод суурийг оруул (b): ");
                    double trb = sc.nextDouble();
                    System.out.print("Өндрийг оруул (h): ");
                    double trh = sc.nextDouble();
                    shape = new Trapezoid(tra, trb, trh);
                    break;
 
                case "circle":
                    System.out.print("Радиусыг оруул (r): ");
                    double r = sc.nextDouble();
                    shape = new Circle(r);
                    break;
 
                case "sector":
                    System.out.print("Радиусыг оруул (r): ");
                    double sr = sc.nextDouble();
                    System.out.print("Өнцгийг оруул (angle°): ");
                    double sang = sc.nextDouble();
                    shape = new Sector(sr, sang);
                    break;
 
                case "ellipse":
                    System.out.print("Том тэнхлэгийг оруул (a): ");
                    double ea = sc.nextDouble();
                    System.out.print("Жижиг тэнхлэгийг оруул (b): ");
                    double eb = sc.nextDouble();
                    shape = new Ellipse(ea, eb);
                    break;
 
                case "parallelogram":
                    System.out.print("Суурийг оруул (a): ");
                    double pa = sc.nextDouble();
                    System.out.print("Өндрийг оруул (h): ");
                    double ph = sc.nextDouble();
                    shape = new Parallelogram(pa, ph);
                    break;
 
                default:
                    System.out.println("Буруу дүрсийн нэр! Дахин оролдоно уу.\n");
                    continue;
            }
 
            
            System.out.printf("Талбай = %.2f%n%n", shape.calculateArea());
        }
 
        sc.close();
    }
}
