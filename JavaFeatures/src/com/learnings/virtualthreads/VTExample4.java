package com.learnings.virtualthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VTExample4 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
		
		for (int i = 0; i < 10_000; i++) {
            int taskId = i;
            executor.submit(() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Task " + taskId +
                        " running in " + Thread.currentThread());
                } catch (InterruptedException e) {
                }
            });
        }
		
		executor.close();
	}

}
