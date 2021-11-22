public class Main {
    public static void main(String[] args) {

            Seconds sec = new Seconds();
            Thread one = new Thread(new ThreadOneSeconds(sec));
            Thread five = new Thread(new ThreadFiveSeconds(sec));
            Thread seven = new Thread(new ThreadSevenSeconds(sec));

            one.start();
            five.start();
            seven.start();
    }
}
