package biydaalt2;

public class RegularCar extends Car {
    private double price;
    private int mileage;
    private String fuel;

    public RegularCar(String brand, String model, int manufacturedYear,
                      int importedYear, String color, String category,
                      double price, int mileage, String fuel) {
        super(brand, model, manufacturedYear, importedYear, color, category);
        this.price = price;
        this.mileage = mileage;
        this.fuel = fuel;
    }

    private String formatPrice(double price) {
        return String.format("%,.0f₮", price);
    }

    public String display() {
        return "=== REGULAR CAR ===\n" +
               super.info() +
               "Price        : " + formatPrice(price) + "\n" +
               "Mileage      : " + mileage + " km\n" +
               "Fuel         : " + fuel + "\n";
    }
}