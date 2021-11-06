import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str ="fgfiop dddddfer 444ggg";

        String[] newStr = str.split(" ");

        String min = "";

        int countMin = str.length();

        for (String a : newStr){
            char[] ch = a.toCharArray();
            Arrays.sort(ch);
            int count = 1;
            for (int i = 1; i < ch.length; i++){
                if(ch[i - 1] == ch[i]){
                    continue;
                }else {
                    count++;
                }
            }
            System.out.println(count);
            if(countMin > count){
                countMin = count;
                min = a;
            }
        }
        System.out.println(min);
    }
}
