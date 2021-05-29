package Inheritance;

public class Main {
    public static void main(String[] args) {
        /**
         * inheritance = the process where one class acquires,
         *               the attributes and methods of another.
         */
        Car car = new Car();
//
//        car.go();
//        car.stop();
        Bicycle bike = new Bicycle();
//        bike.stop();
        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}
