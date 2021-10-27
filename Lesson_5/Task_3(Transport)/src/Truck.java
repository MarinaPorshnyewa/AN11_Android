public class Truck extends TransportLand{
    private double carryingCapacity;

    public Truck(int power, int speedMax, double weight, String model, int countOfWheel, int fuelConsumption, double carryingCapacity) {
        super(power, speedMax, weight, model, countOfWheel, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }
    public void printInformation(){
        super.printInformation();
        System.out.println("Грузоподъемность = " + carryingCapacity + " т");
    }

    public void capacity(double weight){
        String s = carryingCapacity >= weight ? "Грузовик загружен!" : "Вам нужен грузовик побольше!";
        System.out.println(s);
    }
}
