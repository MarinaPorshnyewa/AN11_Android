public class TransportLand extends Transport{
    private int countOfWheels;
    private double fuelConsumption;

    public double getFuelConsumption(){return fuelConsumption;}

    public TransportLand(int power, int speedMax, double weight, String model, int countOfWheel, double fuelConsumption) {
        super(power, speedMax, weight, model);
        this.countOfWheels = countOfWheel;
        this.fuelConsumption = fuelConsumption;
    }
    public void printInformation(){
        super.printInformation();
        System.out.println("Количество колес = " + countOfWheels + ", Расход топлива = " + fuelConsumption + " л/100км.");
    }
}
