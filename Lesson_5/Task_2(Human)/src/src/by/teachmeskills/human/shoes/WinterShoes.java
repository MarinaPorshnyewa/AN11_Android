package src.by.teachmeskills.human.shoes;

public class WinterShoes implements IShoes{
    @Override
    public void putOn() {
        System.out.println("Надеваем зимнюю обувь");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем зимнюю обувь");
    }
}
