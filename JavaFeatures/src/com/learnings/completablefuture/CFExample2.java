package com.learnings.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CFExample2 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();

		CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> {
			System.out.println("Running async task");
		}, executor);

		cf.join();
		executor.shutdown();
	}

}
