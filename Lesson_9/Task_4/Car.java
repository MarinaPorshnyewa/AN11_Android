import java.io.Serializable;

public class Car implements Serializable {

    private String mark;
    private int speed;
    private double price;

    public Car(final String mark,final int speed,final double price) {
        this.mark = mark;
        this.speed = speed;
        this.price = price;
    }

    public Car() {

    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String information(){
        return "Mark = " + mark + " speed = " + speed + " price = " + price;
    }
}
