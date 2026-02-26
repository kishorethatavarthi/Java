package com.learnings.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample7 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		Future<Integer> f1 = executor.submit(() -> {
			System.out.println("f1 Started at " + System.currentTimeMillis());
			Thread.sleep(3000);
			System.out.println("f1 ended at " + System.currentTimeMillis());
			return 10;
		});

		Future<Integer> f2 = executor.submit(() -> {
			System.out.println("f2 Started at " + System.currentTimeMillis());
			Thread.sleep(3000);
			System.out.println("f2 ended at " + System.currentTimeMillis());
			return 10;
		});

		Integer result = f1.get() + f2.get();
		System.out.println(result);

		executor.shutdown();

	}

}
