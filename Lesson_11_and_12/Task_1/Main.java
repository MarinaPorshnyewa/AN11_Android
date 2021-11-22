import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];
        System.out.println("Введите массив: ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        MyThreadMax max = new MyThreadMax(arr);
        MyThreadMin min = new MyThreadMin(arr);


        Thread maxThread = new Thread(max);
        Thread minThread = new Thread(min);
        maxThread.start();
        minThread.start();

        try {
            maxThread.join();
            minThread.join();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
