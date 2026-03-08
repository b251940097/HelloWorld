import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    
        System.out.print("Гэрийн радиус оруулна уу: ");
        double R = input.nextDouble();

        double pi = 3.14;
        double L = 2 * pi * R;

        System.out.printf("Бүслүүрийн урт = %.2f метр\n", L);


        // geometr dundaj
        System.out.print("\n1-р тоо оруулна уу: ");
        double a = input.nextDouble();

        System.out.print("2-р тоо оруулна уу: ");
        double b = input.nextDouble();

        double arithmetic = (a + b) / 2;
        double geometric = Math.sqrt(a * b);

        System.out.printf("Арифметик дундаж = %.2f\n", arithmetic);
        System.out.printf("Геометр дундаж = %.2f\n", geometric);


        // Gurvaljnii talbia

        System.out.print("\nA цэгийн ax: ");
        double ax = input.nextDouble();
        System.out.print("A цэгийн ay: ");
        double ay = input.nextDouble();

        System.out.print("B цэгийн bx: ");
        double bx = input.nextDouble();
        System.out.print("B цэгийн by: ");
        double by = input.nextDouble();

        System.out.print("C цэгийн cx: ");
        double cx = input.nextDouble();
        System.out.print("C цэгийн cy: ");
        double cy = input.nextDouble();

        // gurvan taliin urt
        double AB = Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));
        double BC = Math.sqrt(Math.pow(cx - bx, 2) + Math.pow(cy - by, 2));
        double CA = Math.sqrt(Math.pow(ax - cx, 2) + Math.pow(ay - cy, 2));

        // geronii tomyo
        double s = (AB + BC + CA) / 2;
        double area = Math.sqrt(s * (s - AB) * (s - BC) * (s - CA));

        System.out.printf("Гурвалжны талбай = %.2f\n", area);

        input.close();
    }
}
