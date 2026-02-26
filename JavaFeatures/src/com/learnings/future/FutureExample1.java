package com.learnings.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample1 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Integer> result = service.submit(() -> {
			Thread.sleep(1000);
			return 20;
		});
		System.out.println("Task submitted");
		System.out.println(result.isDone());
		System.out.println("Result is : " + result.get());
		service.shutdown();

	}

}
