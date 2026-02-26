package com.learnings.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CFExample3 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(2);

        CompletableFuture<Integer> cf =
            CompletableFuture.supplyAsync(() -> 5, executor)
                .thenApplyAsync(x -> {
                    System.out.println("Transform in " +
                        Thread.currentThread().getName());
                    return x * 2;
                }, executor);

        System.out.println(cf.get()); // 10
        executor.shutdown();
	}

}
