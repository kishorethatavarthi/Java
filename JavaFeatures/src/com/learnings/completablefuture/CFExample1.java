package com.learnings.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CFExample1 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(() -> {
			System.out.println("Thread: " + Thread.currentThread().getName());
			sleep(1);
			return 10;
		}, executor);

		System.out.println("Result = " + cf.join());

		executor.shutdown();
	}

	static void sleep(int s) {
		try {
			Thread.sleep(s * 1000);
		} catch (Exception ignored) {
		}
	}
}
