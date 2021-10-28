public class Main {
    public static void main(String[] args) {

        IStart space = new Shuttle();

        Spaceport spaceport = new Spaceport();
        spaceport.start(space);
    }
}
