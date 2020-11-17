package Udemy.Room;

public class Bed {
    private String style;
    private int pillows;
    private int height;

    public Bed(String style, int pillows, int height) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
    }

    public void make() {
        System.out.println("Bed -> making");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }
}
