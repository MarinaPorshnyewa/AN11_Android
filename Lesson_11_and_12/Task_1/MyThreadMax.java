public class MyThreadMax implements Runnable{

    int[] arrMax;
    int max;

    public MyThreadMax(int[] arrMax) {
        this.arrMax = arrMax;
    }

    @Override
    public void run() {

        max = arrMax[0];
        for (int i: arrMax){
            if(max < i){
                max = i;
            }
        }
        System.out.println("max = " + max);
    }
}
