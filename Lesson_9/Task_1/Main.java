import java.io.*;

public class Main {
    public static boolean searchPalindrom(String str){

        boolean isPalindrom = false;
        StringBuilder newStr = new StringBuilder();
        for (int i = (str.length()-1); i >= 0; i--){
            newStr.append(str.charAt(i));
        }
        if(str.equals(newStr.toString()) && newStr.length()>1){
            isPalindrom = true;
        }
        return isPalindrom;
    }
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("D:\\TMS\\Task_9\\Task_9_1\\src\\test_1.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\TMS\\Task_9\\Task_9_1\\src\\test_2.txt"))){
            String s;
            while ((s=br.readLine())!=null){
                if(searchPalindrom(s)){
                    bw.write(s + "\n");
                }
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
