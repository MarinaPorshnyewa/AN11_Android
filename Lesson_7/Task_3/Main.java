import java.util.Arrays;

public class Main {
    public static String reversString(String revers){
        String reversStr = "";
        for (int j = (revers.length() - 1); j >= 0; j--){
            reversStr += revers.charAt(j);
        }
        return reversStr;
    }

    public static void main(String[] args) {
        String str = "Довод, прооп ппак кабак. Опеув длнп: радар как как как как как. Пкеав заказ шалаш доход довод. ";
        int max = 0;
        int num = 0;

        String[] newStr = str.split("\\. ");
        System.out.println(Arrays.toString(newStr));

        for (int i = 0; i < newStr.length; i++) {
            String[] newWord = newStr[i].split("\\s*(\\s|,|:|\\.)\\s*");
            System.out.println(Arrays.toString(newWord));
            int count = 0;
            for (String word : newWord){
                if(word.equalsIgnoreCase(reversString(word))){
                    count++;
                }
            }

            System.out.println(count);
            if(max < count){
                max = count;
                num = (i+1);
            }
        }
        System.out.println("Предложение с наибольшим количеством слов " +
                "полиндромов " + num);
    }


}
