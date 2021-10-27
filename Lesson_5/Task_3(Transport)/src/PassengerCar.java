public class PassengerCar extends TransportLand{

    private String bodyType;
    private int countOfPassengers;
    double time;

    public PassengerCar(int power, int speedMax, double weight, String model, int countOfWheel, int fuelConsumption, String bodyType, int countOfPassengers) {
        super(power, speedMax, weight, model, countOfWheel, fuelConsumption);
        this.bodyType = bodyType;
        this.countOfPassengers = countOfPassengers;
    }

    public void printInformation(){
        super.printInformation();
        System.out.println("Тип кузова = " + bodyType + ", количество пассажиов = " + countOfPassengers);
    }

    public double countKm(double time){
        double km = time * super.getSpeedMax();
        System.out.println("За время " + time + " ч автомобиль " + super.getModel() + " двигаясь с максимальной скоростью " +
                super.getSpeedMax() + " км/ч проедет " + km + " км и израсходует " + fuelConsumption(km) + " литров топлива");
        return km;
    }

    private double fuelConsumption(double km){
        return (super.getFuelConsumption() * km)/100;
    }
}
