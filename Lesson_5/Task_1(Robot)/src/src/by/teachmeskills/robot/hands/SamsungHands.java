package src.src.by.teachmeskills.robot.hands;

public class SamsungHands implements IHand{
    private int price;

    public SamsungHands(int price){
        this.price = price;
    }

    public SamsungHands(){}

    @Override
    public void upHand() {
        System.out.println("Поднимает руку Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
