package com.learnings.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample5 {

	public static void main(String[] args) {

		ExecutorService service = Executors.newSingleThreadExecutor();

		Future<Integer> future = service.submit(() -> {
			try {
				while (!Thread.currentThread().isInterrupted()) {
					// simulate work
				}
			} finally {
				System.out.println("Task interrupted, exiting...");
			}
			return 0;
		});

		System.out.println("Task submitted");

		boolean isCancelled = future.cancel(true);
		System.out.println("Cancelled: " + isCancelled);

		service.shutdown();
	}
}