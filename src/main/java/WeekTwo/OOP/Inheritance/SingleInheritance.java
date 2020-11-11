package WeekTwo.OOP.Inheritance;

public class SingleInheritance {
}
class DemoOne {
    String description;
    String productName;
    int productID;
    // const with args..

    public DemoOne(String description, String productName, int productID) {
        this.description = description;
        this.productName = productName;
        this.productID = productID;
    }
    public void changeProductName(String newName) {
        this.productName = newName;
    }
    public void changeDescription(String description) {
        this.description = description;
    }
}
