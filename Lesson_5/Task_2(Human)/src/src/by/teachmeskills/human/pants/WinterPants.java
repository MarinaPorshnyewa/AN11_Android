package src.by.teachmeskills.human.pants;

public class WinterPants implements IPants{
    @Override
    public void putOn() {
        System.out.println("Надеваем зимние штаны");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем зимние штаны");
    }
}
