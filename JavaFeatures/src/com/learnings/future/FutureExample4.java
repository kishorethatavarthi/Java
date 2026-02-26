package com.learnings.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample4 {
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Integer> future = service.submit(() -> {
			while (true) {

			}
		});
		System.out.println("Task submitted");
		boolean isCancelled = future.cancel(true);
		System.out.println(isCancelled);

		service.shutdown();
	}

}
