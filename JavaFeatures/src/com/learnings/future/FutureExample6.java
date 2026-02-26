package com.learnings.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample6 {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		Future<Integer> future = executor.submit(() -> {
		    throw new IllegalStateException("boom");
		});

		try {
		    future.get();
		} catch (ExecutionException e) {
		    Throwable cause = e.getCause(); // real exception
		    System.out.println(cause.getMessage());
		}
	}

}
