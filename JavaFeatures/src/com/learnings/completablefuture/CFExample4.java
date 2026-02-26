package com.learnings.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CFExample4 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);

        CompletableFuture<Integer> cf =
            CompletableFuture.supplyAsync(() -> 3, executor)
                .thenCompose(x ->
                    CompletableFuture.supplyAsync(() -> x * 10, executor)
                );

        System.out.println(cf.join()); // 30
        executor.shutdown();
	}

}
