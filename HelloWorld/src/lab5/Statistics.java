package lab5;
import java.util.Scanner;
public class Statistics {


    public static double mean(double a, double b) {
        return (a + b) / 2;
    }

    public static double mean(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static double mean(double a, double b, double c, double d) {
        return (a + b + c + d) / 4;
    }

    public static double mean(double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5;
    }

    public static double stddev(double a, double b) {
        double m = mean(a, b);
        return Math.sqrt((Math.pow(a-m,2) + Math.pow(b-m,2)) / 2);
    }

    public static double stddev(double a, double b, double c) {
        double m = mean(a, b, c);
        return Math.sqrt((Math.pow(a-m,2) + Math.pow(b-m,2) + Math.pow(c-m,2)) / 3);
    }
    public static double stddev(double a, double b, double c, double d) {
        double m = mean(a, b, c, d);
        return Math.sqrt((Math.pow(a-m,2) + Math.pow(b-m,2) + Math.pow(c-m,2) + Math.pow(d-m,2)) / 4);
    }
    public static double stddev(double a, double b, double c, double d, double e) {
        double m = mean(a, b, c, d, e);
        return Math.sqrt((Math.pow(a-m,2) + Math.pow(b-m,2) + Math.pow(c-m,2) + Math.pow(d-m,2) + Math.pow(e-m,2)) / 5);
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Heden too oruulah ve?" );
    	int n = sc.nextInt();

    	double a[] = new double[n];
    	for(int i = 0; i < n; i++) {
    	    System.out.printf("%d-р тоог оруул: ", i + 1);
    	    a[i] = sc.nextDouble();
    	}
        System.out.println("\n--- Overloading method үр дүн ---");
        switch(n) {
            case 2:
                System.out.println("Mean = " + mean(a[0], a[1]));
                System.out.println("StdDev = " + stddev(a[0], a[1]));
                break;
            case 3:
                System.out.println("Mean = " + mean(a[0], a[1], a[2]));
                System.out.println("StdDev = " + stddev(a[0], a[1], a[2]));
                break;
            case 4:
                System.out.println("Mean = " + mean(a[0], a[1], a[2], a[3]));
                System.out.println("StdDev = " + stddev(a[0], a[1], a[2], a[3]));
                break;
            case 5:
                System.out.println("Mean = " + mean(a[0], a[1], a[2], a[3], a[4]));
                System.out.println("StdDev = " + stddev(a[0], a[1], a[2], a[3], a[4]));
                break;
            default:
                System.out.println("Алдаа: зөвхөн 2-5 хүртэл тоо оруулна уу.");
        }
    }
}
