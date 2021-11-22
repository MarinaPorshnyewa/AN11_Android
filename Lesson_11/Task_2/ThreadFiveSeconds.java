public class ThreadFiveSeconds implements Runnable{

    private final Seconds sec;
    private int counter = 0;

    public ThreadFiveSeconds(final Seconds sec) {
        this.sec = sec;

    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (sec){
                    sec.wait(5000);
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            counter++;
            if(counter == 5){
                sec.five();
            }
        }

    }
}
