package Experiment1;

public class Processor {
    private String brand;
    private double cache;

    Processor () {}

    Processor (String brand, double cache) {
        this.brand = brand;
        this.cache = cache;
    }

    public void info() {
        System.out.printf("Processor = %s\n", brand);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }

    public String getBrand() {
        return this.brand;
    }

    public double getCache() {
        return this.cache;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }
}
