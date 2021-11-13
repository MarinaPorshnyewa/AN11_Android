public class TestText {
    static int count = 0;
    static int number = 1;
    static int number_bad = 0;

    public static void test(String str_text, String str_black){
        String[] s = str_text.split("[,;:.!?\\s]+");
        String[] b = str_black.split("[,;:.!?\\s]+");

        for (String i : s){
            for (String j : b){
                if(i.contains(j)){
                    number_bad = number;
                    count++;
                    System.out.println("black word в предложении #" + number_bad + " " + str_text);
                }
            }
        }
        number++;
    }
    public void printInformation(){
        if(count == 0){
            System.out.println("Текст прошел проверку!");
        }else {
            System.out.println("Всего плохих предложений " + count);
        }
    }
}
