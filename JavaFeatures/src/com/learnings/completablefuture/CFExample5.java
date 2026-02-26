package com.learnings.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CFExample5 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);

        CompletableFuture<Integer> f1 =
            CompletableFuture.supplyAsync(() -> {
                sleep(1);
                return 10;
            }, executor);

        CompletableFuture<Integer> f2 =
            CompletableFuture.supplyAsync(() -> {
                sleep(2);
                return 20;
            }, executor);

        CompletableFuture<Integer> result =
            f1.thenCombine(f2, Integer::sum);

        System.out.println(result.join()); // 30
        executor.shutdown();
    }

    static void sleep(int s) {
        try { Thread.sleep(s * 1000); } catch (Exception ignored) {}
    }
	

}
