public class ThreadOneSeconds implements Runnable{

    private final Seconds sec;

    public ThreadOneSeconds(final Seconds sec) {
        this.sec = sec;
    }

    @Override
    public void run() {
        while (true) {
            try {
                    Thread.sleep(1000);
                    sec.one();

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            synchronized (sec){
                sec.notifyAll();
            }
        }
    }
}
