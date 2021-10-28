public class Shuttle implements IStart{
    @Override
    public boolean checkSystem() {

        int value = (int) ((Math.random()*11)+1);
        if(value > 3){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены! Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
