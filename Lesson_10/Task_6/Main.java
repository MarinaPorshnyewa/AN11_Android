import java.util.Set;
import java.util.TreeSet;

public class Main {
    private static void printSet(Set<Integer> set) {
        if (set.size() != 0) {
            for (Integer i : set) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static Set <Integer> union(Set <Integer> firstSet, Set <Integer> secondSet) {
        Set <Integer> unionSet = new TreeSet<>();
        for (Integer i : firstSet) {
            unionSet.add(i);
        }
        for (Integer i : secondSet) {
            unionSet.add(i);
        }
        return unionSet;
    }

    private static Set <Integer> intersaction(Set <Integer> firstSet, Set <Integer> secondSet) {
        Set <Integer> intersactionSet = new TreeSet <> ();
        for (Integer i : firstSet) {
            for (Integer j : secondSet) {
                if (i == j) {
                    intersactionSet.add(i);
                }
            }
        }
        return intersactionSet;
    }
    public static void main(String[] args) {

        Set <Integer> firstSet = new TreeSet <> ();
        for (int i = 1; i < 11; i++) {
            firstSet.add(i);
        }
        printSet(firstSet);

        Set <Integer> secondSet = new TreeSet <> ();
        for (int i = 5; i < 16; i++) {
            secondSet.add(i);
        }
        printSet(secondSet);

        System.out.print("Union = ");
        printSet(union(firstSet, secondSet));
        System.out.print("Intersect = ");
        printSet(intersaction(firstSet, secondSet));
    }
}
