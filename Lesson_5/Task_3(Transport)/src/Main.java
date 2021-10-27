import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        PassengerCar passengerCar = new PassengerCar(200, 300, 900, "Audi", 4, 8, "универсал", 4);
        passengerCar.printInformation();
        System.out.println("Введите время: ");
        double time = in.nextDouble();
        passengerCar.countKm(time);

        System.out.println();

        Truck truck = new Truck(250, 350, 3500, "Mercedes", 8, 2, 8);
        truck.printInformation();
        System.out.println("Введите количество груза: ");
        double weight = in.nextDouble();
        truck.capacity(weight);

        System.out.println();

        CivilTransport civilTransport = new CivilTransport(200000, 8000, 162000, "Boeing", 80, 2600, 450, true);
        civilTransport.printInformation();
        System.out.println("Введите количество пассажиров: ");
        int count = in.nextInt();
        civilTransport.capacity(count);

        System.out.println();

        MilitaryTransport militaryTransport = new MilitaryTransport(44000, 780, 76000, "Airbus", 42, 980, true, 0);
        militaryTransport.printInformation();
        militaryTransport.shot();
        militaryTransport.ejection();
    }
}
