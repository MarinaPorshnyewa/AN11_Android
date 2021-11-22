import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<HeavyBox> heavyBoxes = new TreeSet<HeavyBox>();
        heavyBoxes.add(new HeavyBox(15,3));
        heavyBoxes.add(new HeavyBox(20,2));
        heavyBoxes.add(new HeavyBox(10,1));

        for (HeavyBox i: heavyBoxes){
            i.printInformation();
        }
    }
}
