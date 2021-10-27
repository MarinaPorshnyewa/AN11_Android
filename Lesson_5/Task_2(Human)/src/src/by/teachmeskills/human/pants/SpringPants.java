package src.by.teachmeskills.human.pants;

public class SpringPants implements IPants{
    @Override
    public void putOn() {
        System.out.println("Надеваем весенние штаны");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаем весенние штаны");
    }
}
