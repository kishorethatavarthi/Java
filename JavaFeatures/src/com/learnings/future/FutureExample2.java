package com.learnings.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Integer> future = service.submit(() -> {
			Thread.sleep(1000);
			return 20;
		});
		System.out.println("Task submitted");
		while (!future.isDone()) {
			System.out.println("Waiting...");
			Thread.sleep(200);
		}

		System.out.println("Result is :" + future.get());
		service.shutdown();
	}

}
