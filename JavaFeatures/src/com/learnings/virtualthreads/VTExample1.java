package com.learnings.virtualthreads;

public class VTExample1 {
	public static void main(String[] args) throws InterruptedException {
		
		Thread vt = Thread.startVirtualThread(()->{
			System.out.println("Running in: " + Thread.currentThread().getName());
			System.out.println("Is virtual thread: " + Thread.currentThread().isVirtual());
		});
		
		vt.join();
	}

}
