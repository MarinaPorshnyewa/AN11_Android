import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String str = "Привет. Это я. Здесь я здесь, здесь очень я хорошо хорошо хорошо я.";
        String[] strArr = str.split("\\s*(\\s|,|!|\\.)\\s*");

        StringBuilder value = new StringBuilder();
        int count = 1;
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println(Arrays.toString(strArr));

        for (int j = 0; j < (strArr.length - 1); j++) {

            if (!strArr[j].equalsIgnoreCase(strArr[j + 1])) {
                value.append(strArr[j] + count + " ");
            }

            if (strArr[j].equalsIgnoreCase(strArr[j + 1])) {
                count++;
            } else {
                count = 1;
            }

            if (j == (strArr.length - 2) && strArr[j].equalsIgnoreCase(strArr[j + 1])) {
                value.append(strArr[j] + count + " ");
            } else if (j == (strArr.length - 2) && !(strArr[j].equalsIgnoreCase(strArr[j + 1]))) {
                value.append(strArr[j+1] + count + " ");
            }
        }

        String result = value.toString();
        String[] newResult = result.split(" ");

        Arrays.sort(newResult, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int a = o1.charAt(o1.length() - 1) - '0';
                int b = o2.charAt(o2.length() - 1) - '0';
                return Integer.compare(a, b);
            }
        });

        for (String arr : newResult) {
            System.out.println(arr.substring(0, arr.length() - 1) + " " + arr.charAt(arr.length() - 1));
        }
    }

}

