public abstract class Transport {
    private int power;
    private int speedMax;
    private double weight;
    String model;

    public int getSpeedMax(){return speedMax;}
    public String getModel(){return model;}

    public Transport(int power, int speedMax, double weight, String model){
        this.power = power;
        this.speedMax = speedMax;
        this.weight = weight;
        this.model = model;
    }

    public double powerKwCalculation(){
        return (power*0.74);
    }

    public void printInformation(){
        System.out.println("Мощность = " + power + " л.с. Это " + powerKwCalculation() + " кВ. Максимальная скорость = " + speedMax + " км/ч. Масса = "
        + weight + " кг. Марка = " + model);
    }
}
