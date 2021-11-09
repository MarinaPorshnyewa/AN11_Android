public class Main {
    public static void main(String[] args) {

        Car car_1 = new Car("BMV", 200, 100000);
        Car car_2 = new Car("Lada", 180, 80000);
        try {
            car_1.start();
        }catch (carException ex){
            System.out.println(ex.getMessage());
        }
        try {
            car_2.start();
        }catch (carException ex){
            System.out.println(ex.getMessage());
        }
    }
}
