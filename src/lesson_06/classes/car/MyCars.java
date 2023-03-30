package lesson_06.classes.car;

public class MyCars {
    public static void main(String[] args) {

        Car myCar = new Car("Tesla",2023,true);
//        System.out.println(myCar.brand);

//        myCar.brand = "Tesla";
        System.out.println("myCar.getYear() = " + myCar.getYear());
        myCar.setYear(3012);
        System.out.println("myCar.getYear() = " + myCar.getYear());
//        myCar.isElectrical = true;

        System.out.println(myCar.toString());
//        System.out.println(myCar.brand+ " " + myCar.year + " " + myCar.isElectrical);

//        Car myBmw = new Car("BMW",2019,false);

//        Car generalCar = new Car("General", true);

//        System.out.println(myBmw.brand+ " " + myBmw.year + " " + myBmw.isElectrical);

//        System.out.println(generalCar.brand+ " " + generalCar.isElectrical);
    }
}
