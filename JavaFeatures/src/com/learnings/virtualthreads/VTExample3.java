package com.learnings.virtualthreads;

public class VTExample3 {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();

        Thread t = Thread.startVirtualThread(() -> {
            try {
            	    //It will not block the platform thread
                Thread.sleep(2000);
                System.out.println("Finished blocking work");
            } catch (InterruptedException e) {
            }
        });

        t.join();
        System.out.println("Time taken: " + (System.currentTimeMillis() - start));
	}

}
