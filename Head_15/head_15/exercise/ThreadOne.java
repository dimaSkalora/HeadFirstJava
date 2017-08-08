package head_15.exercise;

public class ThreadOne implements Runnable{
    Accum a = Accum.getAccum();

    @Override
    public void run() {
        for(int x=0; x<98; x++){
            a.updateCounter(1000);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("one "+a.getCounter());
    }
}
