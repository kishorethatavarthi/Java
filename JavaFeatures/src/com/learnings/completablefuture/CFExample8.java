package com.learnings.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CFExample8 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		ExecutorService executor1 = Executors.newFixedThreadPool(3);

        CompletableFuture<Integer> cf =
            CompletableFuture.supplyAsync(() -> {
            	System.out.println("Transform in " +
                        Thread.currentThread().getName());
            	return 5;
            }, executor)
                .thenApply(x -> {
                    System.out.println("Transform in " +
                        Thread.currentThread().getName());
                    return x * 2;
                });

        System.out.println(cf.get()); // 10
        executor.shutdown();
        executor1.shutdown();
	}

}
