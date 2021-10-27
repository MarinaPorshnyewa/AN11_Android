package src.by.teachmeskills.human;

import java.util.Scanner;
import src.by.teachmeskills.human.jacket.IJacket;
import src.by.teachmeskills.human.jacket.SpringJacket;
import src.by.teachmeskills.human.jacket.WinterJacket;
import src.by.teachmeskills.human.pants.IPants;
import src.by.teachmeskills.human.pants.SpringPants;
import src.by.teachmeskills.human.pants.WinterPants;
import src.by.teachmeskills.human.shoes.IShoes;
import src.by.teachmeskills.human.shoes.SpringShoes;
import src.by.teachmeskills.human.shoes.WinterShoes;

public class Main {

    public static void putOnWinterClothes(Human human){
        human.dress();
    }
    public static void takeOffWinterClothes(Human human){
        human.unDress();
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        IJacket winterJacket = new WinterJacket();
        IJacket springJacket = new SpringJacket();

        IPants winterPants = new WinterPants();
        IPants springPants = new SpringPants();

        IShoes winterShoes = new WinterShoes();
        IShoes springShoes = new SpringShoes();

        Human human_1 = new Human("WinterMan", winterJacket, winterPants, winterShoes);
        Human human_2 = new Human("SpringMan", springJacket, springPants, springShoes);

        System.out.println("Какая пора года: ");
        String season = in.nextLine();
        switch (season){
            case("winter"): putOnWinterClothes(human_1);
            takeOffWinterClothes(human_1);
            break;
            case ("spring"): putOnWinterClothes(human_2);
            takeOffWinterClothes(human_2);
            break;
            default:
                System.out.println("Такой одежды нет!");
        }

    }
}
