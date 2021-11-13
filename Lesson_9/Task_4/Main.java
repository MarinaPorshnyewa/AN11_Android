import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Car car = new Car("bmw", 200, 50000.0);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\TMS\\Task_9\\Task_9_4\\src\\test.txt"))){
            oos.writeObject(car);
            System.out.println("File has been written");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        Car newCar = new Car();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\TMS\\Task_9\\Task_9_4\\src\\test.txt"))){
            newCar = (Car) ois.readObject();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(newCar.information());
    }
}
