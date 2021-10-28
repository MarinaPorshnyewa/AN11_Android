package src.by.teachmeskills.human.jacket;

public class WinterJacket implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Надеваем зимнюю куртку");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем зимнюю куртку");
    }
}
