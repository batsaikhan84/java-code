package WeekTwo.OOP;

public class Car {
    //Global Varaibles
    public String model;
    public int wheel;
    public String color;
    public boolean isEV;

    //Constructor with Args ...
    public Car(String carModel, int carWheels, String carColor, Boolean carEV) {
        this.model = carModel;
        this.wheel = carWheels;
        this.color = carColor;
        this.isEV = carEV;
    }

    public void carTest() {
        System.out.println("Car test completed");
    }
    public void carFix() {
        System.out.println("Car repair is completed");
    }
    public static void carStaticMethod() {
        System.out.println("This is static method");
    }
    public void changeCarColor(String carColor) {
        this.color = carColor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", wheel=" + wheel +
                ", color='" + color + '\'' +
                ", isEV=" + isEV +
                '}';
    }
}