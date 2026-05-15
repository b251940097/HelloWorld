package lab12;

public class Calculator {
    private double add(double a, double b) {
        return a + b;
    }
 
    private double subtract(double a, double b) {
        return a - b;
    }
 
    private double multiply(double a, double b) {
        return a * b;
    }
 
    private double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Тэгд хуваах боломжгүй!");
        return a / b;
    }
 
    public double calculate(double a, double b, String op) {
        return switch (op) {
            case "+" -> add(a, b);
            case "-" -> subtract(a, b);
            case "*" -> multiply(a, b);
            case "/" -> divide(a, b);
            default -> throw new IllegalArgumentException("Буруу үйлдэл");
        };
    }
}