public class CivilTransport extends TransportAir{
    private int countOfPassengers;
    private boolean isBusinessClass;

    public CivilTransport(int power, int speedMax, double weight, String model, int wingspan, int runwayLengthMin, int countOfPassengers, boolean isBusinessClass) {
        super(power, speedMax, weight, model, wingspan, runwayLengthMin);
        this.countOfPassengers = countOfPassengers;
        this.isBusinessClass = isBusinessClass;
    }
    public void printInformation(){
        super.printInformation();
        System.out.println("Количество пассажиров = " + countOfPassengers + ", Наличие бизнес класса = " + isBusinessClass);
    }

    public void capacity(int weight){
        String s = countOfPassengers >= weight ? "Пассажиры посажены!" : "Пассажиры не вместились!";
        System.out.println(s);
    }
}
