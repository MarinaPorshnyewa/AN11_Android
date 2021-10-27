package src.by.teachmeskills.human.jacket;

public class SpringJacket implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Надеваем весеннюю куртку");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем весеннюю куртку");
    }
}
