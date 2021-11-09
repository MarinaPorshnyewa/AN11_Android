public class Car {
    private String brand;
    private int speed;
    private double price;

    public Car() {
    }

    public Car(final String brand,final int speed,final double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public void start() throws carException{
        int value = (int)(Math.random()*21);

        if((value % 2)==0){
            throw new carException("Автомобиль " + brand + " не завелся!");
        }
            System.out.println("Автомобиль " + brand + " завелся!");
    }
}
