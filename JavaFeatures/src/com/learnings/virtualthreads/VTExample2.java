package com.learnings.virtualthreads;

import java.util.ArrayList;
import java.util.List;

public class VTExample2 {
	public static void main(String[] args) throws InterruptedException {
		List<Thread> threads = new ArrayList<>();

		for (int i = 0; i < 1000; i++) {
			int id = i;

			Thread t = Thread.ofVirtual().name("vt-", id).start(() -> {
				Thread current = Thread.currentThread();

				System.out.println("[START]  name=" + current.getName() + ", isVirtual=" + current.isVirtual());

				try {
					System.out.println("[SLEEP]  name=" + current.getName() + " going to sleep");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					current.interrupt();
				}

				System.out.println("[END]    name=" + current.getName());
			});

			threads.add(t);
		}

		for (Thread t : threads) {
			t.join();
		}

		System.out.println("All virtual threads completed");
	}

}
