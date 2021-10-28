public class TransportAir extends Transport{

    private int wingspan;
    private int runwayLengthMin;

    public TransportAir(int power, int speedMax, double weight, String model, int wingspan, int runwayLengthMin) {
        super(power, speedMax, weight, model);
        this.wingspan = wingspan;
        this.runwayLengthMin = runwayLengthMin;
    }

    public void printInformation(){
        super.printInformation();
        System.out.println("Размах крыльев = " + wingspan + " м, минимальная длина взлетно-посадочной полосы для взлета = " + runwayLengthMin);
    }
}
