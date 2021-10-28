import java.util.Timer;
import java.util.TimerTask;

public class Spaceport {

    Timer timer;

    public void start(IStart start){
        if(!start.checkSystem()){
            System.out.println("Предстартовая проверка провалена!");
        }else {
            start.startEngine();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    start.start();
                    timer.cancel();
                }
            };
            timer = new Timer();
            long delay = 10000L;
            timer.schedule(task, delay);

            for (int i = 10; i >= 1; i--){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException ie){}
            }

        }
    }
}
