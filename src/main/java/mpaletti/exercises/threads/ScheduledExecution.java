package mpaletti.exercises.threads;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecution {
    public static void main(String[] args) throws InterruptedException{
        ScheduledExecutorService executor= Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(()->System.out.println(LocalTime.now()+" hello"),0,100, TimeUnit.MILLISECONDS);
    }
}
