package com.learnings.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CFExample7 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();

        CompletableFuture<Integer> cf =
            CompletableFuture.supplyAsync(() -> {
                sleep(3);
                return 1;
            }, executor)
            .orTimeout(1, TimeUnit.SECONDS)
            .exceptionally(ex -> {
                System.out.println("Timeout occurred");
                return -1;
            });

        System.out.println(cf.join());
        executor.shutdown();
    }

    static void sleep(int s) {
        try { Thread.sleep(s * 1000); } catch (Exception ignored) {}
    }

}
