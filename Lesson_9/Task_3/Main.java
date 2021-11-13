import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        TestText my_test = new TestText();

        try(BufferedReader br_text = new BufferedReader(new FileReader("D:\\TMS\\Task_9\\Task_9_3\\src\\text.txt"));
        BufferedReader br_black_list = new BufferedReader(new FileReader("D:\\TMS\\Task_9\\Task_9_3\\src\\black_list.txt"))) {

            String s;
            StringBuilder s2 = new StringBuilder();
            String b;
            StringBuilder b2 = new StringBuilder();

            while (( b = br_black_list.readLine())!=null){
                b2.append(b + " ");
            }

            while ((s=br_text.readLine())!=null){
                s2.append(s + " ");

                my_test.test(s, b2.toString());
            }
            my_test.printInformation();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
