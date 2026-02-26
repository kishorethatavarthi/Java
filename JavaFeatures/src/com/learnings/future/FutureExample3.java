package com.learnings.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureExample3 {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Integer> future = service.submit(() -> {
			Thread.sleep(1000);
			return 20;
		});
		System.out.println("Task submitted");
		try {
			int result = future.get(1, TimeUnit.SECONDS);
		} catch (TimeoutException e) {
			System.out.println("Timeout occured");
		}

		service.shutdown();
	}

}
