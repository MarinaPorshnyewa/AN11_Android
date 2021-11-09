import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Main {
    public static void test() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        throw new NullPointerException();
    }
    public static void main(String[] args) {
        try {
            test();
        }catch (FileNotFoundException ex){
            System.out.println("FileNotFoundException");
        }catch (NullPointerException ex){
            System.out.println("NullPointerException");
        }catch (ArithmeticException ex){
            System.out.println("ArithmeticException");
        } catch (URISyntaxException ex) {
            System.out.println("URISyntaxException");
        }
    }
}
