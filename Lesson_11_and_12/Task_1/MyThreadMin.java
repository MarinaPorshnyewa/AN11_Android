public class MyThreadMin implements Runnable{
    int[] arrMin;
    int min;

    public MyThreadMin(int[] arrMin) {
        this.arrMin = arrMin;
    }
    @Override
    public void run() {

        min = arrMin[0];
        for (int i: arrMin){
            if(min > i){
                min = i;
            }
        }
        System.out.println("min = " + min);
    }
}
