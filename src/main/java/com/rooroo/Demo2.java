package com.rooroo;

public class Demo2 {
	
	public volatile boolean run=false;
	
	public static void main(String[] args) {
		
		Demo2 demo2=new Demo2();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i <10; i++) {
//					System.out.println();
				}
				demo2.run=true;
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (!demo2.run) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("123");
			}
		}).start();
		
		
	}

}
