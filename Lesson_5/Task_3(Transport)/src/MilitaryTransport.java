public class MilitaryTransport extends TransportAir{
    private boolean isEjectionSystem;
    private int countOfRockets;

    public MilitaryTransport(int power, int speedMax, double weight, String model, int wingspan, int runwayLengthMin, boolean isEjectionSystem, int countOfRockets) {
        super(power, speedMax, weight, model, wingspan, runwayLengthMin);
        this.isEjectionSystem = isEjectionSystem;
        this.countOfRockets = countOfRockets;
    }
    public void printInformation(){
        super.printInformation();
        System.out.println("Наличие системы катапультирования = " + isEjectionSystem + ", Количество ракет на борту = " + countOfRockets);
    }

    public void shot(){
        String s = countOfRockets > 0 ? "Ракета пошла" : "Боеприпасы отсутствуют";
        System.out.println(s);
        countOfRockets--;
    }

    public void ejection(){
        String isOrNot = isEjectionSystem ? "Катапультирование прошло успешно" : "У вас нет такой системы";
        System.out.println(isOrNot);
    }
}
