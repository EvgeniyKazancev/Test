public class Car0 {
    private String brand, name;
    private boolean onSale;

    public Car0(String brand, String name, boolean onSale) {
        this.brand = brand;
        this.name = name;
        this.onSale = onSale;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public String toString() {
        return "Car0{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", onSale=" + onSale +
                '}';
    }
}
