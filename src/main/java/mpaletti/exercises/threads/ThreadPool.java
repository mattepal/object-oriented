package mpaletti.exercises.threads;

import java.util.Map;
import java.util.random.RandomGenerator;

public class ThreadPool extends Thread{
    public static int MAX_TASKS=8;
    public static void main(String[] args) throws InterruptedException{
        Thread[] threads=new Thread[MAX_TASKS];
        RandomGenerator rnd=RandomGenerator.getDefault();

        for (int task=0;task<MAX_TASKS;task++){
            int taskNumber=task;
            threads[task]= new Thread(()->{
                long start=System.nanoTime();
               System.out.println("START thread=Thread-" +Thread.currentThread().getName()+ " task="+taskNumber);
                try {
                    Thread.sleep(rnd.nextInt(1000));
                } catch (InterruptedException e) {

                }
                long time=System.nanoTime()-start;
                System.out.println("STOP thread=Thread-"+Thread.currentThread().getName()+" task="+taskNumber+ " t="+time);
            });
        }
        for (int i=0;i< MAX_TASKS;i++){
            threads[i].start();
        }
        for (int i=0;i<MAX_TASKS;i++){
            threads[i].join();
        }
    }
}
