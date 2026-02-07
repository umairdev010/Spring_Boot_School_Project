package org.practice.umair.spring_boot_school_project;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.concurrent.CountDownLatch;

@Component
public class KeepAliveRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application started. Press Ctrl+C to exit.");

        CountDownLatch latch = new CountDownLatch(1);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down...");
            latch.countDown();
        }));

        latch.await();
    }
}
