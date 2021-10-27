package src.by.teachmeskills.human.shoes;

public class SpringShoes implements IShoes{
    @Override
    public void putOn() {
        System.out.println("Надеваем весеннюю обувь");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем весеннюю обувь");
    }
}
