import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("D:\\TMS\\Task_9\\Task_9_2\\src\\text.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\TMS\\Task_9\\Task_9_2\\src\\text_2.txt"))){

            String s;
            String b = "";
            while ((s=br.readLine())!=null){
                b += s;
            }

            String[] newStr = b.split("[.!?]\\s*");

            for (String i: newStr){
                TextFormater t = new TextFormater();
                if(((t.wordCount(i) >= 3) && (t.wordCount(i) <= 5)) || (new TextFormater().searchPalindrom(i)) == true){
                    bw.write(i + "\n");
                }
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
