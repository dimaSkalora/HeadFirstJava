package head_15.exercise;

public class ThreadTwo implements Runnable{
    Accum a = Accum.getAccum();

    @Override
    public void run() {
        for(int x=0; x<99; x++){
            a.updateCounter(1);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("two "+a.getCounter());
    }
}
