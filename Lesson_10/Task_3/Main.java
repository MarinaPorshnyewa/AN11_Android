import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<Person>();
        Person person_1 = new Person("Marina");
        Person person_2 = new Person("Alexander");
        Person person_3 = new Person("Dmitriy");
        Person person_4 = new Person("Alexey");
        Person person_5 = new Person("Olga");

        people.add(person_1);
        people.add(person_2);
        people.add(person_3);
        people.add(person_4);
        people.add(person_5);

        for (Person p: people){
            p.printInformation();
        }

        people.set(1, new Person("Sergey"));

        Person person_6 = new Person("Alexander");

        System.out.println(people.contains(person_6));

        people.remove(people.size()-1);

        for (Person p: people){
            p.printInformation();
        }

        people.removeAll(people);

        for (Person p: people){
            p.printInformation();
        }

    }
}
