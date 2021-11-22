import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Palindrom implements Callable<List<String>> {

    private final List<String> words;
    private final List<String> palindrom;

    public Palindrom(final List<String> words) {
        this.words = words;
        this.palindrom = new ArrayList<>();
    }

    @Override
    public List<String> call() throws Exception {
        if(words == null || words.isEmpty()){
            return null;
        }

        for (String j: words){
            StringBuilder reversStr = new StringBuilder();

            for (int i = j.length()-1; i >= 0; i--){
                reversStr.append(j.charAt(i));
            }
            if(j.equalsIgnoreCase(reversStr.toString())){
                palindrom.add("Это палиндром!");
            }else {
                palindrom.add("Это не палиндром!");
            }
        }
        return palindrom;
    }
}
