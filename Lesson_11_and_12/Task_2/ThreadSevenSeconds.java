public class ThreadSevenSeconds implements Runnable{

    private final Seconds sec;
    private int counter = 0;

    public ThreadSevenSeconds(final Seconds sec) {
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
            if(counter == 7){
                sec.seven();
            }
        }

    }
}
