public class TextFormater {

    public static int wordCount(String str){
        final String[] newStr = str.split(" ");
        return newStr.length;
    }
    public static boolean searchPalindrom(String str){

        String[] array = str.split("[,;:\\s]+");

        boolean isPalindrom = false;
        boolean palindromSentence = false;
        int l = 0;

        while (!palindromSentence && (l < array.length)){

            StringBuilder newStr = new StringBuilder();
            for (int i = (array[l].length()-1); i >= 0; i--){
                newStr.append(array[l].charAt(i));
            }

            if(array[l].equals(newStr.toString()) && array[l].length()>1){
                isPalindrom = true;
            }

            if(isPalindrom){
                palindromSentence = true;
            }
            l++;
        }
        return palindromSentence;
    }
}
