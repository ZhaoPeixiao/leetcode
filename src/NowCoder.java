import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author Peixiao Zhao
 * @date 2020/9/21 22:03
 */
public class NowCoder {

    private static final int SEM_MAX = 5;

    public static void main(String[] args) {
        Semaphore sem = new Semaphore(SEM_MAX);
        ExecutorService thredPool = Executors.newFixedThreadPool(2);
        thredPool.execute(new MyThred(sem, 4));
        thredPool.execute(new MyThred(sem, 3));
        thredPool.shutdown();
    }

}

class MyThred extends Thread{
    private volatile Semaphore sem;
    private int count;
    MyThred(Semaphore sem, int count){
        this.sem = sem;
        this.count = count;
    }
    public void run(){
        try{
            sem.acquire(count);
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " acquire count= " + count);
        } catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            sem.release(count);
            System.out.println(Thread.currentThread().getName() + " release " + count + "");
        }
    }
}
