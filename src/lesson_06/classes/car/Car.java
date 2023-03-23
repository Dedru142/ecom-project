package lesson_06.classes.car;

public class Car {

    String brand;
    int year;
    boolean isElectrical;


    public Car(String brand, int year, boolean isElectrical) {
        this.brand = brand;
        this.year = year;
        this.isElectrical = isElectrical;
    }

    public Car(String brand, boolean isElectrical) {
        this.brand = brand;
        this.isElectrical = isElectrical;
    }
}
