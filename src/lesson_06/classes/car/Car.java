package lesson_06.classes.car;

public class Car {

    private String brand;
    private int year;
    private boolean isElectrical;


    public Car(String brand, int year, boolean isElectrical) {
        this.brand = brand;
        if (year < 2018) {
            this.year = 2018;
        }
        else {
            this.year = year;
        }
        this.isElectrical = isElectrical;
    }

    public Car(String brand, boolean isElectrical) {
        this.brand = brand;
        this.isElectrical = isElectrical;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 2018) {
            this.year = 2018;
        }
        else {
            this.year = year;
        }
    }

    public boolean isElectrical() {
        return isElectrical;
    }

    public void setElectrical(boolean electrical) {
        isElectrical = electrical;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", isElectrical=" + isElectrical +
                '}';
    }
}
