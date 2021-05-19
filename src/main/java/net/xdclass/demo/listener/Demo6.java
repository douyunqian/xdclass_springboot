package net.xdclass.demo.listener;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo6 {
	
	public static void main(String[] args) {
		ExecutorService executors=Executors.newCachedThreadPool();
		
		for(int i=0;i<105;i++) {
			executors.submit(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName());
				}
			});
		}
		executors.shutdown();
		
		
	}

}
