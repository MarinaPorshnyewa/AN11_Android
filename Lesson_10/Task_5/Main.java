import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числа: ");
        Scanner in = new Scanner(System.in);
        String numbers = in.nextLine();
        Set<String> set = new HashSet<>();

        set.addAll(Arrays.asList(numbers.split(" ")));
        System.out.println(set);
    }
}
