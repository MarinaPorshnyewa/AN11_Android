import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {


        List<String> searchPalindrom = new ArrayList<>();
        searchPalindrom.add("шалаш");
        searchPalindrom.add("бутылка");
        searchPalindrom.add("как");
        searchPalindrom.add("рюкзак");
        searchPalindrom.add("папап");
        System.out.println(searchPalindrom);

        final ExecutorService executor = Executors.newCachedThreadPool();
        final Future<List<String>> isPalindrom = executor.submit(new Palindrom(searchPalindrom));
        executor.shutdown();

        try {
            System.out.println(isPalindrom.get());
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }catch (ExecutionException ex){
            ex.printStackTrace();
        }
    }
}
