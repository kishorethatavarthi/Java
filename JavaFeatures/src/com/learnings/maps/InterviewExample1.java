package com.learnings.maps;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InterviewExample1 {
	public static void main(String[] args) throws InterruptedException {
		Map<String,Integer> map = new ConcurrentHashMap<>();
		Runnable r = ()->{
			for(int i=0;i<1000;i++) {
				map.compute("count", (k,v) -> v == null ? 1 : v+1);
			}
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(map);
		
		
	}

}
