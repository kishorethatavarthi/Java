package com.learnings.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CFExample6 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();

        CompletableFuture<Object> cf =
            CompletableFuture.supplyAsync(() -> {
                throw new RuntimeException("boom");
            }, executor).exceptionally(ex -> {
                System.out.println("Handled: " + ex.getMessage());
                return -1;
            });

        System.out.println(cf.join()); // -1
        executor.shutdown();
	}

}
