package WeekTwo.OOP;

public class CarShop {
    public static void main(String[] args) {
        Car carOne = new Car("Model X", 4, "Red", true);
        System.out.println(carOne);
        carOne.changeCarColor("Black");
        System.out.println(carOne);
        carOne.carFix();
        carOne.carTest();
        //For static method
        // ClassName:staticMethodname
        Car.carStaticMethod();
    }

}
